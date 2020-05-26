package com.rent.manager.mapper;

import com.rent.manager.model.Rooms;

public interface RoomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    Rooms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);
}