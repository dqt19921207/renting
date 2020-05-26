package com.rent.manger.model;

import java.math.BigDecimal;


public class Building {
    private Integer id;

    private String name;

    private String addr;

    private String number;

    private Integer userId;

    private BigDecimal watetFee;

    private BigDecimal elcFee;

    private Integer del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getWatetFee() {
        return watetFee;
    }

    public void setWatetFee(BigDecimal watetFee) {
        this.watetFee = watetFee;
    }

    public BigDecimal getElcFee() {
        return elcFee;
    }

    public void setElcFee(BigDecimal elcFee) {
        this.elcFee = elcFee;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}