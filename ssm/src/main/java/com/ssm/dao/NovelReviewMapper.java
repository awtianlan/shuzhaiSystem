package com.ssm.dao;

import com.ssm.model.NovelReview;
import com.ssm.model.NovelReviewExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelReviewMapper {
    int countByExample(NovelReviewExample example);

    int deleteByExample(NovelReviewExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(NovelReview record);

    int insertSelective(NovelReview record);

    List<NovelReview> selectByExample(NovelReviewExample example);

    List<NovelReview> getReview(BigDecimal nid);

    List<NovelReview> getAllReview();

    NovelReview selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") NovelReview record, @Param("example") NovelReviewExample example);

    int updateByExample(@Param("record") NovelReview record, @Param("example") NovelReviewExample example);

    int updateByPrimaryKeySelective(NovelReview record);

    int updateByPrimaryKey(NovelReview record);
}