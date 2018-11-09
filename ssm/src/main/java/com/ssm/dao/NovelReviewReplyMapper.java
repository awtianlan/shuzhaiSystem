package com.ssm.dao;

import com.ssm.model.NovelReviewReply;
import com.ssm.model.NovelReviewReplyExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NovelReviewReplyMapper {
    int countByExample(NovelReviewReplyExample example);

    int deleteByExample(NovelReviewReplyExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(NovelReviewReply record);

    int insertSelective(NovelReviewReply record);

    int getCountOfNRRByRpId(BigDecimal rpid);

    List<NovelReviewReply> getNRRByRpID(BigDecimal rpid);

    List<NovelReviewReply> selectByExample(NovelReviewReplyExample example);

    List<NovelReviewReply> getNovelReviewReplysByNRID(BigDecimal nrid);

    NovelReviewReply selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") NovelReviewReply record, @Param("example") NovelReviewReplyExample example);

    int updateByExample(@Param("record") NovelReviewReply record, @Param("example") NovelReviewReplyExample example);

    int updateByPrimaryKeySelective(NovelReviewReply record);

    int updateByPrimaryKey(NovelReviewReply record);
}