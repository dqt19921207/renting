package com.rent.manager.model;

import com.rent.manager.util.QueryRequest;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class Rooms  extends QueryRequest {
    private Integer id;

    private String rooms;

    private BigDecimal fee;

    private Integer type;

    private Integer del;

    private BigDecimal water;

    private BigDecimal elect;
    private BigDecimal waterFee;

    private BigDecimal elcFee;

    /**
     * 楼栋号
     */
    private String buildName;
    private Integer buildId;
    private Integer pcount;
    private Integer userId;

}