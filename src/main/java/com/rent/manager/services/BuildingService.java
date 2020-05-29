package com.rent.manager.services;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rent.manager.mapper.BuildingMapper;
import com.rent.manager.mapper.UserMapper;
import com.rent.manager.model.Building;
import com.rent.manager.model.User;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingService {

    @Autowired
    BuildingMapper buildingMapper;

    public Result getBuildingList(Building building) {
        Result result = new MapResult();
        List<Building> res = buildingMapper.getList(building);
        Page page= PageHelper.startPage(building.getPageNum(),building.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():res);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }

    public Result addBuilding(Building building) throws Exception {
        Result result = new MapResult();

        buildingMapper.insertSelective(building);
        result.defaultSuccess();
        return result;
    }

    public Result updateBuilding(Building building) throws Exception {
        Result result = new MapResult();
        buildingMapper.updateByPrimaryKeySelective(building);
        result.defaultSuccess();
        return result;
    }

}
