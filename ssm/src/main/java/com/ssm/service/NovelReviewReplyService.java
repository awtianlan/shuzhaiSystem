package com.ssm.service;

import com.ssm.model.NovelReviewReply;

import java.math.BigDecimal;
import java.util.List;

public interface NovelReviewReplyService {
    public List<NovelReviewReply> getNRRByNrid(BigDecimal nrid);
    public List<NovelReviewReply> getNRRByRpID(BigDecimal rpid);
    public NovelReviewReply getNRRByid(BigDecimal id);
    public  int getCountOfNRRByRpId(BigDecimal rpid);
    public void updateById(NovelReviewReply novelReviewReply);
}
