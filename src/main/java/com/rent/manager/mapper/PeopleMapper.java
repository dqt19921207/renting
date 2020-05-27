package com.rent.manager.mapper;

import com.rent.manager.model.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}