package com.rent.manger.controller;

import com.rent.manger.model.User;
import com.rent.manger.util.MapResult;
import com.rent.manger.util.Result;
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

    @GetMapping("/login")
    public Result login( ) {

        Result result = new MapResult();
        System.out.println(1111111);
        result.defaultSuccess();
        return result;

    }

}
