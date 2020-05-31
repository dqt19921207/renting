package com.rent.manager.services;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rent.manager.mapper.BuildingMapper;
import com.rent.manager.mapper.PeopleMapper;
import com.rent.manager.mapper.RoomsMapper;
import com.rent.manager.model.Building;
import com.rent.manager.model.Rooms;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomsService {

    @Autowired
    RoomsMapper roomsMapper;
    @Autowired
    PeopleMapper peopleMapper;
//    @Autowired
//    BuildingMapper buildingMapper;

    public Result getRoomsList(Rooms rooms) {
        Result result = new MapResult();
        List<Rooms> res = roomsMapper.getList(rooms);
        for (Rooms r:res){
//            Building b=buildingMapper.selectByPrimaryKey(r.getBuildId());
            int count=peopleMapper.selectRommsPeople(r.getId());
            r.setPcount(count);
//            r.set
        }
        Page page= PageHelper.startPage(rooms.getPageNum(),rooms.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():res);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }

    public Result addRooms(Rooms rooms) throws Exception {
        Result result = new MapResult();

        roomsMapper.insertSelective(rooms);
        result.defaultSuccess();
        return result;
    }

    public Result updateRooms(Rooms rooms) throws Exception {
        Result result = new MapResult();
        roomsMapper.updateByPrimaryKeySelective(rooms);
        result.defaultSuccess();
        return result;
    }

}
