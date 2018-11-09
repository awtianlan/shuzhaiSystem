package com.ssm.controller;

import com.ssm.util.CodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/code")
public class CodeController {
    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest req, HttpServletResponse resp){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();

        // 将四位数字的验证码保存到Session中。
        HttpSession session = req.getSession();
        session.setAttribute("code", codeMap.get("code").toString());
        System.out.println(session.getAttribute("code"));

        // 禁止图像缓存。
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", -1);

        resp.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
      //  ServletOutputStream sos;
        try {
           // sos = resp.getOutputStream();
           // ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
           // sos.close();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "JPEG", resp.getOutputStream());


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @RequestMapping("/getCodeInfo")
    @ResponseBody
    public String getCodeInfo(HttpServletRequest req){
        HttpSession session = req.getSession();
        return  session.getAttribute("code").toString();
    }
}
