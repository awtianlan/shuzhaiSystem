package com.ssm.controller;

import com.ssm.model.Chapter;
import com.ssm.model.Novel;
import com.ssm.service.ChapterService;
import com.ssm.service.NovelService;
import com.ssm.util.CreateHtmlUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("file")
public class FileController {
    @Resource
    private NovelService novelService;
    @Resource
    private ChapterService chapterService;
    @RequestMapping("uploadnovel")
    public String uploadNovel(@RequestParam(value = "file") MultipartFile file, Model model, Novel novel,HttpServletRequest request){
        try {

            //上传后的地址，注意("/upload")是表示文件上传后的目标文件夹

            String realPath = "E:\\IDEA\\worksplace\\upload";



            System.out.println("打印文件上传的路径"+realPath);

            //获取文件名

            String filename = file.getOriginalFilename();

            //获取文件后缀名

            String extensionname = filename.substring(filename.lastIndexOf(".") + 1);

            //给上传的文件起别名，有很多种方式

            String newFilename=String.valueOf(System.currentTimeMillis())+"."+extensionname;

            //创建File对象，传入目标路径参数，和新的文件别名

           // realPath=makePath(filename,realPath);

            File dir=new File(realPath,newFilename);

            if (!dir.exists()){//如果dir代表的文件不存在，则创建它，

                dir.mkdirs();//

            }

            //如果存在则直接执行下面操作

            file.transferTo(dir);//将上传的实体文件复制到指定目录upload下

            novel.setFileLink(dir.getPath());
            novelService.addNovel(novel);
            novel=novelService.getNovelByName(novel.getName());
            AnalyNovel(dir.getPath(),novel);
            System.out.println(novel.getId());

        } catch (IOException e) {

            e.printStackTrace();

        }

        return "/activate";//执行完毕，返回一个逻辑视图
    }



    public  void AnalyNovel(String path, Novel novel){


        try {
            String temppath="E:\\IDEA\\worksplace\\ssm\\src\\main\\webapp\\template\\template.html";
            String dirpath="E:\\IDEA\\worksplace\\upload\\chapter";
            Chapter c=new Chapter();
            c.setNovel(novel);
            String encoding = "UTF-8";
            File file = new File(path);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);// 考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                int offset = 0; //章节所在行数
                int count = 0; //章节数
                int i=0;
                String chapter=null;
                String content=null;
                Pattern p=Pattern.compile("(第([\\u4e00-\\u9fa5]{1,7}|[0-9]{1,5})章).*");
                Matcher m;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    if (i == 0)//读取第一行，将前三个字节去掉，重新new个String对象
                    {
                        byte[] bytes = lineTxt.getBytes("UTF-8");
                        lineTxt = new String(bytes, 3, bytes.length - 3,"UTF-8");

                        i++;
                    }

                   System.out.println(lineTxt);
                    m=p.matcher(lineTxt);
                    System.out.println(m.matches());
                    if(m.matches()){
                        System.out.println("======章节====="+lineTxt);
                        if(count>0 && content!=null){
                            String chapter_link=CreateHtmlUtils.MakeHtml(temppath,content,dirpath,chapter,makeFileName(novel.getName()));
                            c.setName(chapter);
                            c.setChapterLink(chapter_link);
                            c.setnId(novel.getId());
                            chapterService.addChapter(c);
                        }
                        // String[] strs=lineTxt.split(",");
                        chapter=lineTxt;
                        content=null;
                        count++;
                        System.out.println("------------"+count);
                    }else{
                        content+=lineTxt;
                    }

                }
                String chapter_link=CreateHtmlUtils.MakeHtml(temppath,content,dirpath,chapter,makeFileName(novel.getName()));
                c.setName(chapter);
                c.setChapterLink(chapter_link);
                c.setnId(novel.getId());
                chapterService.addChapter(c);

                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }
    /**
     * @Method: makeFileName
     * @Description: 生成上传文件的文件名，文件名以：uuid+"_"+文件的原始名称
     * @param filename 文件的原始名称
     * @return uuid+"_"+文件的原始名称
     */
    private String makeFileName(String filename){  //2.jpg
        //为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
        return UUID.randomUUID().toString() ;
    }

    /**
     * 为防止一个目录下面出现太多文件，要使用hash算法打散存储
     *
     * @param filename 文件名，要根据文件名生成存储目录
     * @param savePath 文件存储路径
     * @return 新的存储目录
     */
    private String makePath(String filename,String savePath){
        //得到文件名的hashCode的值，得到的就是filename这个字符串对象在内存中的地址
        int hashcode = filename.hashCode();
        int dir1 = hashcode&0xf;  //0--15
        int dir2 = (hashcode&0xf0)>>4;  //0-15
        //构造新的保存目录
        String dir = savePath + "\\" + dir1 + "\\" + dir2;  //upload\2\3  upload\3\5
        //File既可以代表文件也可以代表目录
        File file = new File(dir);
        //如果目录不存在
        if(!file.exists()){
            //创建目录
            file.mkdirs();
        }
        return dir;
    }
}
