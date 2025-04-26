package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.Environment;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.EnvironmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/environment")
@RestController
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;


    // 根据fieldId 查询环境信息
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
           log.info("查询环境信息，fieldId={}", fieldId);
        Environment environment = environmentService.getByFieldId(fieldId);
        return Result.success(environment);
    }

}
