package com.ssm.model;

import java.math.BigDecimal;
import java.util.List;

public class Novel {
    private BigDecimal id;

    private String name;

    private String author;

    private String fileLink;

    private String description;

    private String novelpic;

    private List<Chapter> chapters;

    private List<Excerpt> excerpts;

    public List<Excerpt> getExcerpts() {
        return excerpts;
    }

    public void setExcerpts(List<Excerpt> excerpts) {
        this.excerpts = excerpts;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink == null ? null : fileLink.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNovelpic() {
        return novelpic;
    }

    public void setNovelpic(String novelpic) {
        this.novelpic = novelpic == null ? null : novelpic.trim();
    }
}