package com.ssm.model;

import java.math.BigDecimal;

public class Up {
    private BigDecimal id;

    private Object mac;

    private BigDecimal nrid;

    private BigDecimal nrrid;

    private BigDecimal eid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getMac() {
        return mac;
    }

    public void setMac(Object mac) {
        this.mac = mac;
    }

    public BigDecimal getNrid() {
        return nrid;
    }

    public void setNrid(BigDecimal nrid) {
        this.nrid = nrid;
    }

    public BigDecimal getNrrid() {
        return nrrid;
    }

    public void setNrrid(BigDecimal nrrid) {
        this.nrrid = nrrid;
    }

    public BigDecimal getEid() {
        return eid;
    }

    public void setEid(BigDecimal eid) {
        this.eid = eid;
    }
}