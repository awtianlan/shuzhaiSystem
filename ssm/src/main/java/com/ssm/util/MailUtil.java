package com.ssm.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class MailUtil {
    public void send(String email,String title,String con){

        // 1.创建一个程序与邮件服务器会话对象 Session
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "SMTP");
        props.setProperty("mail.smtp.host", "smtp.qq.com");
        props.setProperty("mail.smtp.port", "25");
        // 指定验证为true
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.timeout","1000");
        // 验证账号及密码，密码需要是第三方授权码
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("1450056746@qq.com", "nvytdzhlbfhxjahf");
            }
        };
        Session session = Session.getInstance(props, auth);

// 2.创建一个Message，它相当于是邮件内容
        Message message = new MimeMessage(session);
        //设置自定义发件人昵称
          String nick="";
          try {              nick=javax.mail.internet.MimeUtility.encodeText("天蓝科技");
          } catch (UnsupportedEncodingException e) {
              e.printStackTrace();          }


// 设置发送者
        try {
            message.setFrom(new InternetAddress(nick +"<1450056746@qq.com>"));
        } catch (MessagingException e) {
            e.printStackTrace();
        }
// 设置发送方式与接收者
        try {
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(email));
        } catch (MessagingException e) {
            e.printStackTrace();
        }
// 设置主题
        try {
            message.setSubject(title);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
// 设置内容
//        try {
//            collect(in,message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            message.setContent(con, "text/html;charset=utf-8");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

// 3.创建 Transport用于将邮件发送
        try {
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
