package com.rent.manager.services;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rent.manager.mapper.BuildingMapper;
import com.rent.manager.mapper.PeopleMapper;
import com.rent.manager.mapper.PeopleMapper;
import com.rent.manager.mapper.RoomsMapper;
import com.rent.manager.model.Building;
import com.rent.manager.model.People;
import com.rent.manager.model.Rooms;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    PeopleMapper peopleMapper;
    @Autowired
    RoomsMapper roomsMapper;

    public Result getPeopleList(People people) {
        Result result = new MapResult();
        List<People> res = peopleMapper.getList(people);
        Page page= PageHelper.startPage(people.getPageNum(),people.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():res);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }
    public Result getPeopleHistoryList(People people) {
        Result result = new MapResult();
        List<People> res = peopleMapper.getHistoryList(people);
        Page page= PageHelper.startPage(people.getPageNum(),people.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():res);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }
    public Result getNumList(People people) {
        Result result = new MapResult();
        List<People> res = peopleMapper.getNumList(people);
        Page page= PageHelper.startPage(people.getPageNum(),people.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():res);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }
    public Result calcPayFee(People people) {
        Result result = new MapResult();
        People res = peopleMapper.selectByPrimaryKey(people.getId());
        Rooms ress = roomsMapper.selectByPrimaryKey(people.getRooms());
//        页面传递的当前电度减去库里查的入住电度数
        BigDecimal elecDiff=people.getOutElec().subtract(res.getInElec());
//        页面传递的当前水表减去库里查的入住水表数
        BigDecimal waterDiff=people.getOutWater().subtract(res.getInWater());
//        差额乘以楼栋里设置的单价
        BigDecimal elecFee=elecDiff.multiply(ress.getElcFee());
        BigDecimal waterFee=waterDiff.multiply(ress.getWaterFee());

//        租金+水电=总额
        BigDecimal pay= res.getFee().add(elecFee).add(waterFee).setScale(2,BigDecimal.ROUND_HALF_UP);
        result.setData("fee",pay);

        result.defaultSuccess();
        return result;
    }

    public Result peopleOut(People people) {
        Result result = new MapResult();
        peopleMapper.peopleOut(people);
        result.defaultSuccess();
        return result;
    }
    public Result getHistoryFee(People people) throws Exception {
        Result result = new MapResult();

        People res = peopleMapper.selectHistoryFee(people);
        result.setData("data",res);
        result.defaultSuccess();
        return result;
    }

    public Result addPeople(People people) throws Exception {
        Result result = new MapResult();

        peopleMapper.insertSelective(people);
        result.defaultSuccess();
        return result;
    }

    public Result updatePeople(People people) throws Exception {
        Result result = new MapResult();
        peopleMapper.updateByPrimaryKeySelective(people);
        result.defaultSuccess();
        return result;
    }

}
