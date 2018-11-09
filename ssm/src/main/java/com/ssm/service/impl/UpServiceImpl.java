package com.ssm.service.impl;

import com.ssm.dao.UpMapper;
import com.ssm.model.Up;
import com.ssm.service.UpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class UpServiceImpl implements UpService {
    @Resource
    private UpMapper upMapper;
    @Override
    public void add(Up up) {
        upMapper.insert(up);
    }

    @Override
    public Up getUpBy(String mac, BigDecimal nrid) {
        return upMapper.selectByMac(mac,nrid);
    }

    @Override
    public Up getUpByMacAndUp( Up up) {
        return upMapper.selectByMacByMacAndUp(up);
    }
}
