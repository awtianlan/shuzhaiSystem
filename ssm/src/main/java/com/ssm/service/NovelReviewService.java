package com.ssm.service;

import com.ssm.model.NovelReview;


import java.math.BigDecimal;
import java.util.List;

public interface NovelReviewService {
    List<NovelReview> getReview(BigDecimal nid);
    List<NovelReview> getReview();
    NovelReview getNovelReviewById(BigDecimal id);
    NovelReview getById(BigDecimal id);
    void updateById(NovelReview novelReview);
    void add(NovelReview novelReview);

}
