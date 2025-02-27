package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.Field;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 地块

@Slf4j
@RequestMapping("/field")
@RestController
public class FieldController {
    @Autowired
    private FieldService fieldService;

    // 查询所有地块
    @GetMapping
    public Result list() {
        log.info("查询所有地块");
        List<Field> fieldlist = fieldService.findAll();
        return Result.success(fieldlist);
    }

    // 增加地块
    @PostMapping
    public Result add(@RequestBody Field field) {
        log.info("增加地块" + field);
        fieldService.add(field);
        return Result.success();
    }

    // 根据id删除地块
    @DeleteMapping
    public Result delete(Integer id) {
        log.info("删除地块，id=" + id);
        fieldService.deleteById(id);
        return Result.success();
    }

}
