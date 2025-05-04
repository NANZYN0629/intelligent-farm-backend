package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/environmentAlarm")
@RestController

public class EnvironmentAlarmController {

    @Autowired
    private EnvironmentAlarmService environmentAlarmService;

    // 查询所有的环境报警
//    @GetMapping
//    public Result list() {
//        log.info("查询所有的环境报警");
//        List<EnvironmentAlarm> environmentAlarmlist = environmentAlarmService.findAll();
//        return Result.success(environmentAlarmlist);
//    }

    @GetMapping
    public Result page(EnvironmentAlarmQueryParam environmentAlarmQueryParam){
        log.info("环境报警分页查询:{}",environmentAlarmQueryParam);
        PageResult<EnvironmentAlarm> pageResult = environmentAlarmService.page(environmentAlarmQueryParam);
        return Result.success(pageResult);
    }





}
