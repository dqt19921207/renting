package com.rent.manager.model;

import com.rent.manager.util.QueryRequest;

import java.math.BigDecimal;
import java.util.Date;

public class Fee extends QueryRequest {
    private Integer id;

    private Integer rooms;

    private BigDecimal water;

    private BigDecimal waterFee;

    private BigDecimal elect;

    private BigDecimal electFee;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public BigDecimal getWater() {
        return water;
    }

    public void setWater(BigDecimal water) {
        this.water = water;
    }

    public BigDecimal getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(BigDecimal waterFee) {
        this.waterFee = waterFee;
    }

    public BigDecimal getElect() {
        return elect;
    }

    public void setElect(BigDecimal elect) {
        this.elect = elect;
    }

    public BigDecimal getElectFee() {
        return electFee;
    }

    public void setElectFee(BigDecimal electFee) {
        this.electFee = electFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}