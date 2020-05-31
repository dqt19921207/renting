package com.rent.manager.controller;

import com.rent.manager.model.Building;
import com.rent.manager.model.User;
import com.rent.manager.services.BuildingService;
import com.rent.manager.services.UserService;
import com.rent.manager.util.MapResult;
import com.rent.manager.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/building")
@CrossOrigin
@Slf4j
public class BuildingController {

    @Autowired
    BuildingService buildingService;

    @PostMapping("/list")
    public Result getUserList(@RequestBody Building building) {
        if (building.getRole() == 0)
            building.setUserId(null);
        Result userList = buildingService.getBuildingList(building);
        return userList;
    }


    @PostMapping("/addBuilding")
    public Result addBuilding(@RequestBody Building building) {

        Result result = new MapResult();
        try {
            building.setUserId(building.getUserId());
            result = buildingService.addBuilding(building);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @PostMapping("/updateBuilding")
    public Result updateBuilding(@RequestBody Building building) {

        Result result = new MapResult();
        try {
            result = buildingService.updateBuilding(building);
        } catch (Exception e) {
            result.defaultFail(e.getMessage());
        }
        return result;
    }
}
