package com.ssm.service.impl;

import com.ssm.dao.ExcerptMapper;
import com.ssm.model.Excerpt;
import com.ssm.service.ExcerptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class ExcerptServiceImpl implements ExcerptService {
    @Resource
    private ExcerptMapper excerptMapper;
    @Override
    public void insertExcerpt(Excerpt excerpt) {
        excerptMapper.insert(excerpt);
    }

    @Override
    public Excerpt getExcerptById(int id) {
        return excerptMapper.selectByPrimaryKey(BigDecimal.valueOf(id));
    }

    @Override
    public Excerpt getExcerptByName(String name) {
        return null;
    }
}
