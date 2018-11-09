package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

@Controller
@RequestMapping("/mail")
public class MailController {
    @RequestMapping("/send")
    public String sendMail(String email){
        //new BufferedReader(new InputStreamReader(System.in));
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
// 设置发送者
        try {
            message.setFrom(new InternetAddress("1450056746@qq.com"));
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
            message.setSubject("用户激活");
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
        StringBuffer sb = new StringBuffer();
        sb.append("<HTML>\n");
        sb.append("<HEAD>\n");
        sb.append("<TITLE>\n");
        sb.append("test" + "\n");
        sb.append("</TITLE>\n");
        sb.append("</HEAD>\n");

        sb.append("<BODY>\n");
        sb.append("<H1>" + "test" + "</H1>" + "\n");


        sb.append("www.baidu.com");
        sb.append("\n");


        sb.append("</BODY>\n");
        sb.append("</HTML>\n");

        try {
            message.setContent(sb.toString(), "text/html;charset=utf-8");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

// 3.创建 Transport用于将邮件发送
        try {
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "page/index";
    }

    public static void collect(BufferedReader in, Message msg)
            throws MessagingException, IOException {
        String line;
        String subject = msg.getSubject();
        StringBuffer sb = new StringBuffer();
        sb.append("<HTML>\n");
        sb.append("<HEAD>\n");
        sb.append("<TITLE>\n");
        sb.append(subject + "\n");
        sb.append("</TITLE>\n");
        sb.append("</HEAD>\n");

        sb.append("<BODY>\n");
        sb.append("<H1>" + subject + "</H1>" + "\n");

        while ((line = in.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        sb.append("</BODY>\n");
        sb.append("</HTML>\n");

        msg.setDataHandler(new DataHandler(
                new ByteArrayDataSource(sb.toString(), "text/html")));
    }
    }

