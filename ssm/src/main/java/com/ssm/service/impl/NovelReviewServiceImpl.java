package com.ssm.service.impl;

import com.ssm.dao.NovelReviewMapper;
import com.ssm.model.NovelReview;
import com.ssm.model.Up;
import com.ssm.service.NovelReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
@Service
public class NovelReviewServiceImpl implements NovelReviewService {
    @Resource
    private NovelReviewMapper novelReviewMapper;
    @Override
    public List<NovelReview> getReview(BigDecimal nid) {
        return novelReviewMapper.getReview(nid);
    }

    @Override
    public List<NovelReview> getReview() {
        return novelReviewMapper.getAllReview();
    }

    @Override
    public NovelReview getNovelReviewById(BigDecimal id) {
        return novelReviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public NovelReview getById(BigDecimal id) {
        return novelReviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateById(NovelReview novelReview) {
        novelReviewMapper.updateByPrimaryKey(novelReview);
    }

    @Override
    public void add(NovelReview novelReview) {
        novelReviewMapper.insert(novelReview);
    }
}
