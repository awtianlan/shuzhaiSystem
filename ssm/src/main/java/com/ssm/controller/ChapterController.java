package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.ssm.model.Chapter;
import com.ssm.service.ChapterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("chapter")
public class ChapterController {
    @Resource
    private ChapterService chapterService;
    @RequestMapping(value="getpage",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getPageOfChapter(int nid,int page){

        PageHelper.startPage(page,10);
        List<Chapter> chapters=chapterService.getChaptersByNId(nid);
        PageInfo pageinfo=new PageInfo(chapters,5);
        Gson gson=new Gson();
        String json=gson.toJson(pageinfo);
        return json;

    }

}
