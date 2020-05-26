package com.rent.manager.services;


import com.rent.manager.mapper.UserMapper;
import com.rent.manager.model.User;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;

    public Result login(User user) {
        Result result = new MapResult();
        User userdata = userMapper.selectByUsername(user.getUsername());
        if (userdata.getPassword().equals(user.getPassword())) {
            result.setData("user", userdata);
            result.defaultSuccess();
        } else
            result.defaultFail("用户名或者密码错误！");
        return result;
    }
}
