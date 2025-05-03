package com.sipc.intelligentfarmbackend.controller;

import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmSetService;
import com.sipc.intelligentfarmbackend.service.EnvironmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/environmentAlarmSet")
@RestController

public class EnvironmentAlarmSetController {


    @Autowired
    private EnvironmentAlarmSetService environmentAlarmSetService;



    // 根据fieldId查找环境报警设置
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
        log.info("查询环境报警设置，fieldId={}", fieldId);
        List<EnvironmentAlarmSet> environmentAlarmSet = environmentAlarmSetService.getByFieldId(fieldId);
        return Result.success(environmentAlarmSet);
    }

    // 插入环境报警设置
    @PostMapping
    public Result insert(@RequestBody EnvironmentAlarmSet environmentAlarmSet) {
        log.info("插入环境报警设置，environmentAlarmSet={}", environmentAlarmSet);
        environmentAlarmSetService.insert(environmentAlarmSet);
        return Result.success();
    }


    // 更新环境报警设置
    @PutMapping
    public Result update(@RequestBody EnvironmentAlarmSet environmentAlarmSet) {
        log.info("更新环境报警设置，environmentAlarmSet={}", environmentAlarmSet);
        environmentAlarmSetService.update(environmentAlarmSet);
        return Result.success();
    }




}
