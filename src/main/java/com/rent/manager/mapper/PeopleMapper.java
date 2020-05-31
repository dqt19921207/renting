package com.rent.manager.mapper;

import com.rent.manager.model.People;
import com.rent.manager.model.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PeopleMapper {
    int deleteByPrimaryKey(Integer id);

    int selectRommsPeople(Integer roomsId);
    int insert(People record);
    int peopleOut(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer id);
    List<People>  getNumList(People record);
    People selectHistoryFee(People record);
    List<People> getList(People record);
    List<People> getHistoryList(People record);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}