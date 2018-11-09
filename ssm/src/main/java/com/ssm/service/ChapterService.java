package com.ssm.service;

import com.ssm.model.Chapter;

import java.util.List;

public interface ChapterService {
    public Chapter getChapterByName(String name);
    public Chapter getChapterById(int id);
    public void addChapter(Chapter chapter);
    public List<Chapter> getChaptersByNId(int id);
}
