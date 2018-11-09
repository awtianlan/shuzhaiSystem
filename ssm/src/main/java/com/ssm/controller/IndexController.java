package com.ssm.controller;

import com.ssm.model.Novel;
import com.ssm.service.ChapterService;
import com.ssm.service.NovelService;
import com.ssm.service.UserService;
import com.ssm.util.PropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("index")
public class IndexController {
    @Resource
    private UserService userService;
    @Resource
    private NovelService novelService;
    @Resource
    private ChapterService chapterService;
    @RequestMapping("show")
    public String showview(HttpServletRequest request, Model model){
        List<Novel> novels=novelService.getAll();
        model.addAttribute("novels",novels);
        model.addAttribute("path",PropertiesUtil.getProperties("otherimg"));
        model.addAttribute("img",PropertiesUtil.getProperties("headpath"));
        return "/index";
    }
}
