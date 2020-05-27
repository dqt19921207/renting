package com.rent.manager.mapper;

import com.rent.manager.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    List<User> getUserList(User record);

    User selectByPrimaryKey(Integer id);
//    @Select("select * from user where username='${username}'")
    User selectByUsername(@Param("username") String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}