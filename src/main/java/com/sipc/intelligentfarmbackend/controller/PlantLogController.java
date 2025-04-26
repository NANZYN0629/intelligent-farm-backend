package com.sipc.intelligentfarmbackend.controller;


// 种植日志

import com.sipc.intelligentfarmbackend.pojo.PlantLog;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.PlantLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/log")
@RestController
public class PlantLogController {

    @Autowired
    private PlantLogService plantLogService;

    // 根据地块id显示种植日志
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
        log.info("查询地块id=%d的种植日志".formatted(fieldId));
        List<PlantLog> plantLog = plantLogService.getByFieldId(fieldId);
        return Result.success(plantLog);
    }

    // 添加种植日志
    @PostMapping
    public Result add(@RequestBody PlantLog plantLog) {
        log.info("添加种植日志");
        plantLogService.add(plantLog);
        return Result.success();
    }
}
