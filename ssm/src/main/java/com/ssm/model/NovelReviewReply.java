package com.ssm.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class NovelReviewReply {
    private BigDecimal id;

    private BigDecimal uId;

    private BigDecimal nRId;

    private String content;

    private Date createTime;

    private BigDecimal rpId;

    private BigDecimal likeNum;

    private User user;

    private List<NovelReviewReply> novelReviewReplies;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<NovelReviewReply> getNovelReviewReplies() {
        return novelReviewReplies;
    }

    public void setNovelReviewReplies(List<NovelReviewReply> novelReviewReplies) {
        this.novelReviewReplies = novelReviewReplies;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getuId() {
        return uId;
    }

    public void setuId(BigDecimal uId) {
        this.uId = uId;
    }

    public BigDecimal getnRId() {
        return nRId;
    }

    public void setnRId(BigDecimal nRId) {
        this.nRId = nRId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getRpId() {
        return rpId;
    }

    public void setRpId(BigDecimal rpId) {
        this.rpId = rpId;
    }

    public BigDecimal getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(BigDecimal likeNum) {
        this.likeNum = likeNum;
    }
}