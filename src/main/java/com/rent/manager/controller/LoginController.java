package com.rent.manager.controller;

import com.rent.manager.model.User;
import com.rent.manager.services.LoginService;
import com.rent.manager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Copyright © 2019 Shanghai zhiWang information technology co. LTD
 *
 * @description:
 * @author: dqt
 * @date: 2020/5/25 16:41
 */
@RestController
@RequestMapping("/renting")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody User user ) {

        Result result = loginService.login(user);
        return result;

    }

}
