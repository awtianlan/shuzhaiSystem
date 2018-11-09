package com.ssm.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

/**
 * @ClassName: CreateHtmlUtils
 * @Description: Java 根据模板创建 html
 * @author
 * @date 2016年4月22日 下午3:51:16
 */
public class CreateHtmlUtils {

    public static void main(String[] args) {
        String filePath = "E:\\IDEA\\worksplace\\ssm\\src\\main\\webapp\\template\\template.html";
        String context ="testsomany";
        String disrPath = "E:\\test";
        String fileName = "aa";
        String chapter="first";
       MakeHtml(filePath,context,disrPath,fileName,chapter);
    }
    /**
     * @Title: MakeHtml
     * @Description: 创建html
     * @param    filePath 设定模板文件
     * @param    context 需要显示
     * @param    disrPath  生成html的存放路径
     * @param    fileName  生成html名字
     * @return void    返回类型
     * @throws
     */
    public static String MakeHtml(String filePath,String context,String disrPath,String chapter,String fileName ){
        try {
            //System.out.print(filePath);
            String title = chapter;
            String content=context;

            String templateContent = "";
            FileInputStream fileinputstream = new FileInputStream(filePath);// 读取模板文件
            int lenght = fileinputstream.available();
            byte bytes[] = new byte[lenght];
            fileinputstream.read(bytes);
            fileinputstream.close();
            templateContent = new String(bytes,"UTF-8");
            //System.out.print(templateContent);
            templateContent = templateContent.replaceAll("###chapter###", title);
            templateContent = templateContent.replaceAll("###content###", content);
           //System.out.print(templateContent);

            String fileame = fileName + ".html";
            fileame = disrPath+"/" + fileame;// 生成的html文件保存路径。
            FileOutputStream fileoutputstream = new FileOutputStream(fileame);// 建立文件输出流
            System.out.print("文件输出路径:");
            System.out.print(fileame);
            byte tag_bytes[] = templateContent.getBytes();
            fileoutputstream.write(tag_bytes);
            fileoutputstream.close();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return fileName+".html";
    }


}
