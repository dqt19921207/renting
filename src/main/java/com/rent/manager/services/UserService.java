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
}
