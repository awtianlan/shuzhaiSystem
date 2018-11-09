package com.ssm.model;

import java.math.BigDecimal;

public class Chapter {
    private BigDecimal id;

    private String name;

    private BigDecimal nId;

    private String chapterLink;

    private Novel novel;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getnId() {
        return nId;
    }

    public void setnId(BigDecimal nId) {
        this.nId = nId;
    }

    public String getChapterLink() {
        return chapterLink;
    }

    public void setChapterLink(String chapterLink) {
        this.chapterLink = chapterLink == null ? null : chapterLink.trim();
    }
}