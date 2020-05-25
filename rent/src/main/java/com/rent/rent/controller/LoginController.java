package com.rent.rent.controller;

import com.rent.rent.model.User;
import com.rent.rent.util.MapResult;
import com.rent.rent.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Copyright © 2019 Shanghai zhiWang information technology co. LTD
 *
 * @description:
 * @author: dqt
 * @date: 2020/5/25 16:41
 */
@RestController
@RequestMapping("/renting")
public class LoginController {

    @PostMapping("login")
    public Result login(@RequestBody User user) {

        Result result = new MapResult();
        System.out.println(1111111);
        result.defaultSuccess();
        return result;

    }

}
