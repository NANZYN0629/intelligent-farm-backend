package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmSet;
import com.sipc.intelligentfarmbackend.pojo.Field;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

// 地块

@Slf4j
@RequestMapping("/field")
@RestController
public class FieldController {
    @Autowired
    private FieldService fieldService;

    @Autowired
    private EnvironmentAlarmSetController environmentAlarmSetController;

    // 查询所有地块
    @GetMapping
    public Result list() {
        log.info("查询所有地块");
        List<Field> fieldlist = fieldService.findAll();
        return Result.success(fieldlist);
    }

    // 根据id查询地块
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("查询地块，id=" + id);
        List<Field> field = fieldService.getById(id);
        return Result.success(field);
    }

    // 增加地块
    @PostMapping
    public Result add(@RequestBody Field field) {
        log.info("增加地块" + field);
        // 确保 fieldService.add(field) 方法回填主键 id
        field = fieldService.add(field);

        // 创建六个环境报警设置
        String[] programs = {"temperature", "moisture", "light", "co2", "ph", "nitrogen"};
        for (String program : programs) {
            EnvironmentAlarmSet alarmSet = new EnvironmentAlarmSet();
            alarmSet.setFieldId(field.getId()); // 确保这里的 fieldId 不为 null
            alarmSet.setProgram(program);
            alarmSet.setMax(new BigDecimal(10000)); // 默认最大值
            alarmSet.setMin(new BigDecimal(-20));   // 默认最小值
            environmentAlarmSetController.insert(alarmSet);
        }

        return Result.success();
    }

    // 根据id删除地块
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除地块，id=" + id);
        fieldService.deleteById(id);
        return Result.success();
    }

    // 根据id修改地块信息
    @PutMapping
    public Result update(@RequestBody Field field) {
        log.info("修改地块信息" + field);
        fieldService.update(field);
        return Result.success();
    }

}
