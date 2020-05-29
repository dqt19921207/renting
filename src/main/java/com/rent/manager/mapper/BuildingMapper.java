package com.rent.manager.mapper;

import com.rent.manager.model.Building;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BuildingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer id);
    List<Building> getList(Building record);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}