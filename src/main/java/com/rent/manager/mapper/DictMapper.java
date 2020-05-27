package com.rent.manager.mapper;

import com.rent.manager.model.Dict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}