package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.pojo.Sensor;
import com.sipc.intelligentfarmbackend.service.SensorService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/sensor")
@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    // 根据地块id查询传感器信息

    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
        log.info("查询地块的传感器信息"+fieldId);
        List<Sensor> sensor = sensorService.getByFieldId(fieldId);
        return Result.success(sensor);
    }


    // 添加传感器信息
    @PostMapping
    public Result add(@RequestBody Sensor sensor) {
        log.info("添加传感器信息" + sensor);
        sensorService.add(sensor);
        return Result.success();
    }

    // 根据id删除传感器信息
    @DeleteMapping
    public Result delete(Integer id) {
        log.info("删除传感器信息，id="+id);
        sensorService.deleteById(id);
        return Result.success();
    }

    // 根据id更新传感器信息
    @PutMapping
    public Result update(@RequestBody Sensor sensor) {
        log.info("传感器编号"+ sensor.getId() + "更新传感器信息" + sensor.getStatus());
        sensorService.update(sensor);
        return Result.success();
    }

}
