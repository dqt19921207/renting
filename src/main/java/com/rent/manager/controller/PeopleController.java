package com.rent.manager.controller;

import com.rent.manager.model.People;
import com.rent.manager.model.Rooms;
import com.rent.manager.services.PeopleService;
import com.rent.manager.services.RoomsService;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.locks.Condition;

@RestController
@RequestMapping("/people")
@CrossOrigin
@Slf4j
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    @PostMapping("/list")
    public Result getList(@RequestBody People people) {
        Result userList = peopleService.getPeopleList(people);
        return userList;
    }
    @PostMapping("/historyList")
    public Result historyList(@RequestBody People people) {
        Result userList = peopleService.getPeopleHistoryList(people);
        return userList;
    }


    @PostMapping("/getNumList")
    public Result getNumList(@RequestBody People people) {
        Result userList = peopleService.getNumList(people);
        return userList;
    }

    @PostMapping("/calcPayFee")
    public Result calcPayFee(@RequestBody People people) {
        Result userList = peopleService.calcPayFee(people);
        return userList;
    }
    @PostMapping("/peopleOut")
    public Result peopleOut(@RequestBody People people) {
        Result userList = peopleService.peopleOut(people);
        return userList;
    }
    @PostMapping("/getHistoryFee")
    public Result getHistoryFee(@RequestBody People people) {
        Result userList = new MapResult();
        try {
            userList = peopleService.getHistoryFee(people);
        } catch (Exception e) {
            e.printStackTrace();
            userList.defaultFail(e.getMessage());
        }
        return userList;
    }


    @PostMapping("/addPeople")
    public Result addPeople(@RequestBody People people) {

        Result result = new MapResult();
        try {
            people.setUserId(people.getUserId());
            result = peopleService.addPeople(people);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @PostMapping("/updatePeople")
    public Result updatePeople(@RequestBody People people) {

        Result result = new MapResult();
        try {
            result = peopleService.updatePeople(people);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
        }
        return result;
    }
}
