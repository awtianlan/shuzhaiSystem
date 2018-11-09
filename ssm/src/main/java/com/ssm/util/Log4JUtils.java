package com.ssm.util;

import org.apache.log4j.Logger;


public class Log4JUtils {
    private static Logger logger =  null;

    public static Logger getLogger(){
        if (null == logger){
            String classname = new Exception().getStackTrace()[1].getClassName();
            //Java8 废弃了Reflection.getCallerClass()
            logger = Logger.getLogger(classname+".class");
            /*  String className = "";
        String methodName = "";
        Class clazz = null;
        StackTraceElement[] elements = new Throwable().getStackTrace();
        for (int i = 0; i < elements.length; i++){
            if (this.getClass().getName().equals(elements[i].getClassName())){
                // 获取堆栈的下一个元素，就是调用者元素
                // 如果想要获取当前方法所在类的信息，直接读取elements[i]就可以了
                className = elements[i + 1].getClassName();
                methodName = elements[i + 1].getMethodName();
                break;
            }
        }
        System.out.println(className + "." + methodName + "\n");*/

        }
        return logger;
    }
}
