package com.ssm.dao;

import com.ssm.model.Up;
import com.ssm.model.UpExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpMapper {
    int countByExample(UpExample example);

    int deleteByExample(UpExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Up record);

    int insertSelective(Up record);

    List<Up> selectByExample(UpExample example);

    Up selectByMac(@Param("mac") String mac, @Param("nrid")BigDecimal nrid );

    Up selectByMacByMacAndUp( Up example );

    Up selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Up record, @Param("example") UpExample example);

    int updateByExample(@Param("record") Up record, @Param("example") UpExample example);

    int updateByPrimaryKeySelective(Up record);

    int updateByPrimaryKey(Up record);
}