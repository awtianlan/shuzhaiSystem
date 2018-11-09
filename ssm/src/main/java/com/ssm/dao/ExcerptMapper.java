package com.ssm.dao;

import com.ssm.model.Excerpt;
import com.ssm.model.ExcerptExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcerptMapper {
    int countByExample(ExcerptExample example);

    int deleteByExample(ExcerptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Excerpt record);

    int insertSelective(Excerpt record);

    List<Excerpt> selectByExample(ExcerptExample example);

    Excerpt selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Excerpt record, @Param("example") ExcerptExample example);

    int updateByExample(@Param("record") Excerpt record, @Param("example") ExcerptExample example);

    int updateByPrimaryKeySelective(Excerpt record);

    int updateByPrimaryKey(Excerpt record);
}