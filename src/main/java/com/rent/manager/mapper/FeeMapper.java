package com.rent.manager.mapper;

import com.rent.manager.model.Fee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fee record);

    int insertSelective(Fee record);

    Fee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fee record);

    int updateByPrimaryKey(Fee record);
}