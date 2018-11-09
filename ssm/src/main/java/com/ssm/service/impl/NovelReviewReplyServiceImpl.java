package com.ssm.service.impl;

import com.ssm.dao.NovelReviewReplyMapper;
import com.ssm.model.NovelReviewReply;
import com.ssm.service.NovelReviewReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class NovelReviewReplyServiceImpl implements NovelReviewReplyService {
@Autowired
    private NovelReviewReplyMapper novelReviewReplyMapper;


    @Override
    public List<NovelReviewReply> getNRRByNrid(BigDecimal nrid) {
        return novelReviewReplyMapper.getNovelReviewReplysByNRID(nrid);
    }

    @Override
    public List<NovelReviewReply> getNRRByRpID(BigDecimal rpid) {
        return novelReviewReplyMapper.getNRRByRpID(rpid);
    }

    @Override
    public NovelReviewReply getNRRByid(BigDecimal id) {
        return novelReviewReplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int getCountOfNRRByRpId(BigDecimal rpid) {
        return novelReviewReplyMapper.getCountOfNRRByRpId(rpid);
    }

    @Override
    public void updateById(NovelReviewReply novelReviewReply) {
        novelReviewReplyMapper.updateByPrimaryKey(novelReviewReply);
    }
}
