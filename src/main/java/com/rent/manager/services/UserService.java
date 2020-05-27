package com.rent.manager.services;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rent.manager.mapper.UserMapper;
import com.rent.manager.model.User;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Result getUserList(User user) {
        Result result = new MapResult();
        List<User> userdata = userMapper.getUserList(user);
        Page page= PageHelper.startPage(user.getPageNum(),user.getPageSize(),true);
        result.setData("list", page.getResult()==null?new ArrayList<>():userdata);
        result.setData("pageNum", page.getPageNum());
        result.setData("pageSize", page.getPageSize());
        result.setData("pages", page.getPageSize());
        result.setData("total", page.getTotal());
        result.defaultSuccess();
        return result;
    }

    public Result addUser(User user) throws Exception {
        Result result = new MapResult();
//        先查用户名重复
        User repeat = userMapper.selectByUsername(user.getUsername());
        if (repeat!=null)
            throw  new Exception("该用户已存在！");
        user.setDel(0);
        user.setRole(1);
        user.setRolename("楼栋管理员");

        userMapper.insertSelective(user);
        result.defaultSuccess();
        return result;
    }

    public Result updateUser(User user) throws Exception {
        Result result = new MapResult();
        userMapper.updateByPrimaryKeySelective(user);
        result.defaultSuccess();
        return result;
    }

}
