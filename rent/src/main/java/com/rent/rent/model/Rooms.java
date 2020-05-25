package com.rent.rent.model;

import java.math.BigDecimal;

public class Rooms {
    private Integer id;

    private String rooms;

    private BigDecimal fee;

    private Integer type;

    private Integer del;

    private Long water;

    private Long elect;

    private Integer buildId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms == null ? null : rooms.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Long getWater() {
        return water;
    }

    public void setWater(Long water) {
        this.water = water;
    }

    public Long getElect() {
        return elect;
    }

    public void setElect(Long elect) {
        this.elect = elect;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }
}