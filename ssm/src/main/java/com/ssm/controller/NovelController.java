package com.ssm.controller;

import com.ssm.model.Novel;
import com.ssm.service.NovelService;
import com.ssm.util.PropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("novel")
public class NovelController {
    @Resource
    private NovelService novelService;
    @RequestMapping("novelinfo")
    public String getNovelInfo(int id, Model model){
        Novel novel=novelService.getNovelById(id);
        novel.setNovelpic(PropertiesUtil.getProperties("novelpath")+novel.getNovelpic());

        model.addAttribute("novel",novel);
        model.addAttribute("path",PropertiesUtil.getProperties("chapterpath"));
        model.addAttribute("img",PropertiesUtil.getProperties("headpath"));
        return "/novel";
    }
}
