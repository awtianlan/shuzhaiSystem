package com.ssm.service;

import com.ssm.model.Up;

import java.math.BigDecimal;

public interface UpService {
    public void add(Up up);
    public Up  getUpBy(String mac, BigDecimal nrid);
    public Up  getUpByMacAndUp( Up up);

}
