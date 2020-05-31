package com.rent.manager.controller;

import com.rent.manager.model.Rooms;
import com.rent.manager.services.RoomsService;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
@CrossOrigin
@Slf4j
public class RoomsController {

    @Autowired
    RoomsService roomsService;

    @PostMapping("/list")
    public Result getList(@RequestBody Rooms rooms) {
        if (rooms.getRole() == 1)
            rooms.setUserId(rooms.getUserId());
        else
            rooms.setUserId(null);
        Result userList = roomsService.getRoomsList(rooms);
        return userList;
    }


    @PostMapping("/addRooms")
    public Result addRooms(@RequestBody Rooms rooms) {

        Result result = new MapResult();
        try {
            rooms.setUserId(rooms.getUserId());
            result = roomsService.addRooms(rooms);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @PostMapping("/updateRooms")
    public Result updateRooms(@RequestBody Rooms rooms) {

        Result result = new MapResult();
        try {
            result = roomsService.updateRooms(rooms);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
        }
        return result;
    }
}
