package com.rent.manager.controller;

import com.rent.manager.model.User;
import com.rent.manager.services.UserService;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/list")
    public Result getUserList(@RequestBody User user) {

        Result userList = userService.getUserList(user);
        return userList;
    }


}
