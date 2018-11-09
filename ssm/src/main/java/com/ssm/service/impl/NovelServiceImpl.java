package com.ssm.service.impl;

import com.ssm.dao.NovelMapper;
import com.ssm.model.Novel;
import com.ssm.service.NovelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NovelServiceImpl implements NovelService {
    @Resource
    private NovelMapper novelMapper;
    @Override
    public Novel getNovelById(int id) {
        return novelMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addNovel(Novel novel) {
        novelMapper.insert(novel);
    }

    @Override
    public Novel getNovelByName(String name) {
        return novelMapper.selectByName(name);
    }

    @Override
    public List<Novel> getAll() {
        return novelMapper.selectAll();
    }
}
