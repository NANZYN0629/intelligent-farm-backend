package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/environmentAlarm")
@RestController

public class EnvironmentAlarmController {

    @Autowired
    private EnvironmentAlarmService environmentAlarmService;


    //  环境报警分页查询
    @GetMapping
    public Result page(EnvironmentAlarmQueryParam environmentAlarmQueryParam){
        log.info("环境报警分页查询:{}",environmentAlarmQueryParam);
        PageResult<EnvironmentAlarm> pageResult = environmentAlarmService.page(environmentAlarmQueryParam);
        return Result.success(pageResult);
    }

    // 传输一组数组，删除环境报警
    @DeleteMapping
    public Result delete(@RequestBody List<Integer> ids){
        log.info("删除环境报警:{}",ids);
        environmentAlarmService.delete(ids);
        return Result.success();
    }







}
