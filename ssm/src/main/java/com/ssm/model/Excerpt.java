package com.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Excerpt {
    private BigDecimal id;

    private String content;

    private Date createTime;

    private BigDecimal createPerson;

    private BigDecimal source;

    private BigDecimal likeNum;

    private String eComment;

    private Novel novel;

    private User user;

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

    public BigDecimal getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(BigDecimal createPerson) {
        this.createPerson = createPerson;
    }

    public BigDecimal getSource() {
        return source;
    }

    public void setSource(BigDecimal source) {
        this.source = source;
    }

    public BigDecimal getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(BigDecimal likeNum) {
        this.likeNum = likeNum;
    }

    public String geteComment() {
        return eComment;
    }

    public void seteComment(String eComment) {
        this.eComment = eComment == null ? null : eComment.trim();
    }
}