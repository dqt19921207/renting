package com.rent.manager.mapper;

import com.rent.manager.model.Building;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuildingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}