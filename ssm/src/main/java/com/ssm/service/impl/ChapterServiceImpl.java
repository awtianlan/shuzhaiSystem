package com.ssm.service.impl;

import com.ssm.dao.ChapterMapper;
import com.ssm.model.Chapter;
import com.ssm.service.ChapterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {
    @Resource
    private ChapterMapper chapterMapper;

    @Override
    public Chapter getChapterByName(String name) {
        return chapterMapper.selectByName(name);
    }

    @Override
    public Chapter getChapterById(int id) {
        return chapterMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addChapter(Chapter chapter) {
        chapterMapper.insert(chapter);
    }

    @Override
    public List<Chapter> getChaptersByNId(int id) {
        return chapterMapper.getChaptersByNId(id);
    }
}
