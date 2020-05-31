package com.rent.manager.mapper;

import com.rent.manager.model.Building;
import com.rent.manager.model.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rooms record);

    int insertSelective(Rooms record);

    Rooms selectByPrimaryKey(Integer id);
    List<Rooms> getList(Rooms record);

    int updateByPrimaryKeySelective(Rooms record);

    int updateByPrimaryKey(Rooms record);
}