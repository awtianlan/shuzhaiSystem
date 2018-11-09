package com.ssm.service;

import com.ssm.model.Novel;

import java.util.List;

public interface NovelService {
    public Novel getNovelById(int id);
    public void addNovel(Novel novel);
    public Novel getNovelByName(String name);
    public List<Novel> getAll();
}
