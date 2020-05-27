package com.rent.manager.mapper;

import com.rent.manager.model.Rooms;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    Rooms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);
}