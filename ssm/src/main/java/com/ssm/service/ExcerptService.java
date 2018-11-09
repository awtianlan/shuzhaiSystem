package com.ssm.service;

import com.ssm.model.Excerpt;

public interface ExcerptService {
    public void insertExcerpt(Excerpt excerpt);
    public Excerpt getExcerptById(int id);
    public Excerpt getExcerptByName(String name);
}
