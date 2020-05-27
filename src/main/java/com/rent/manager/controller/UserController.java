package com.rent.manager.controller;

import com.rent.manager.model.User;
import com.rent.manager.services.UserService;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/list")
    public Result getUserList(@RequestBody User user) {

        Result userList = userService.getUserList(user);
        return userList;
    }


    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {

        Result result = new MapResult();
        try {
            result = userService.addUser(user);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {

        Result result = new MapResult();
        try {
            result = userService.updateUser(user);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
        }
        return result;
    }
}
