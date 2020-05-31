package com.rent.manager.model;

import com.rent.manager.util.QueryRequest;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class People extends QueryRequest {
    private Integer id;

    private String name;

    private String addr;

    private String idcard;

    private String tel;

    private String sex;

    private Integer rooms;

    private Integer del;

    private Date outTime;


    private Date inTime;
    private String num;
    private BigDecimal inElec;
    private BigDecimal inWater;
    private BigDecimal outElec;
    private BigDecimal outWater;
    private BigDecimal fee;
    private BigDecimal payFee;
}