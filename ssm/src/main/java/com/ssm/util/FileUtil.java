//package com.ssm.util;
//
//import com.ssm.model.Chapter;
//import com.ssm.model.Novel;
//import com.ssm.service.ChapterService;
//import com.ssm.service.NovelService;
//import com.ssm.service.impl.ChapterServiceImpl;
//import com.ssm.service.impl.NovelServiceImpl;
//
//import javax.annotation.Resource;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//import java.util.UUID;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class FileUtil {
////    @Resource
////    private NovelService novelService;
//
//    private static ChapterService chapterService=new ChapterServiceImpl();
//    public static void AnalyNovel(String path,String novelpath, Novel novel){
//        try {
//            Chapter c=new Chapter();
//            c.setNovel(novel);
//            String encoding = "UTF-8";
//            File file = new File(path);
//            if (file.isFile() && file.exists()) { // 判断文件是否存在
//                InputStreamReader read = new InputStreamReader(
//                        new FileInputStream(file), encoding);// 考虑到编码格式
//                BufferedReader bufferedReader = new BufferedReader(read);
//                String lineTxt = null;
//                int offset = 0; //章节所在行数
//                int count = 0; //章节数
//                String chapter=null;
//                String content=null;
//                Pattern p=Pattern.compile("第([\\u4e00-\\u9fa5]{1,7}|[0-9]{1,5})章");
//                while ((lineTxt = bufferedReader.readLine()) != null) {
//                    Matcher m=p.matcher(lineTxt);
//                    if(m.matches()){
//                        if(count>0){
//                        String chapter_link=CreateHtmlUtils.MakeHtml(path,content,novelpath,chapter,makeFileName(novel.getName()));
//                        c.setName(chapter);
//                        c.setChapterLink(chapter_link);
//                        chapterService.addChapter(c);
//                        }
//                       // String[] strs=lineTxt.split(",");
//                        chapter=lineTxt;
//                        content=null;
//                    }else{
//                        content+=lineTxt;
//                    }
//
//                }
//
//                read.close();
//            } else {
//                System.out.println("找不到指定的文件");
//            }
//        } catch (Exception e) {
//            System.out.println("读取文件内容出错");
//            e.printStackTrace();
//        }
//    }
//    private static String makeFileName(String filename){  //2.jpg
//        //为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
//        return UUID.randomUUID().toString() + "_" + filename;
//    }
//}
