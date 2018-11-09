package com.ssm.util;

import java.io.*;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties properties;

    public static String getProperties(String parm) {
        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("E:\\IDEA\\worksplace\\ssm\\src\\main\\resources\\project.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取key对应的value值
     return   properties.getProperty(parm);

    }

    public static void main(String[] args) {
        System.out.println(getProperties("ssmpath"));
    }

}
