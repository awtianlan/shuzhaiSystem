package com.ssm.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class NovelReview {
    private BigDecimal id;

    private BigDecimal nId;

    private String content;

    private Date createTime;

    private BigDecimal likeNum;

    private BigDecimal uId;

    private User user;

     private Novel novel;

    private List<NovelReviewReply> novelReviewReplies;

    public List<NovelReviewReply> getNovelReviewReplies() {
        return novelReviewReplies;
    }

    public void setNovelReviewReplies(List<NovelReviewReply> novelReviewReplies) {
        this.novelReviewReplies = novelReviewReplies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Novel getNovel() {
        return novel;
    }

    public void setNovel(Novel novel) {
        this.novel = novel;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getnId() {
        return nId;
    }

    public void setnId(BigDecimal nId) {
        this.nId = nId;
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

    public BigDecimal getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(BigDecimal likeNum) {
        this.likeNum = likeNum;
    }

    public BigDecimal getuId() {
        return uId;
    }

    public void setuId(BigDecimal uId) {
        this.uId = uId;
    }
}