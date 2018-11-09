package com.ssm.controller;

import com.google.gson.Gson;
import com.ssm.model.Chapter;
import com.ssm.model.Excerpt;
import com.ssm.model.User;
import com.ssm.service.ChapterService;
import com.ssm.service.ExcerptService;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("excerpt")
public class ExcerptController {
    @Resource
    private ExcerptService excerptService;
    @Resource
    private UserService userService;
    @Resource
    private ChapterService chapterService;
    @RequestMapping("add")
    @ResponseBody
    public String addExcerpt(HttpServletRequest request,@RequestParam("callback") String callback){
        Gson gson=new Gson();
        Map<Object,Object> map=new HashMap<>();

        String comment=request.getParameter("comment");
        String content=request.getParameter("content");
        String chapter=request.getParameter("chapter");
        String name=request.getParameter("name");
        User user=userService.getUserByName(name);
        Chapter chapter1=chapterService.getChapterByName(chapter);
        Excerpt excerpt=new Excerpt();
        excerpt.setContent(content);
        excerpt.seteComment(comment);

        excerpt.setSource(chapter1.getNovel().getId());
        excerpt.setCreatePerson(user.getId());

        excerpt.setCreateTime(new Date());
        excerptService.insertExcerpt(excerpt);
        map.put("status","1");
        return callback+"("+gson.toJson(map)+")";

    }
}
