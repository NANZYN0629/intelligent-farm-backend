package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.DiseaseQueryParam;
import com.sipc.intelligentfarmbackend.service.DiseaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/disease")
@RestController

public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    // 分页查询
    @GetMapping
    public Object page(DiseaseQueryParam diseaseQueryParam) {
        log.info("分页查询:{}", diseaseQueryParam);
        return diseaseService.page(diseaseQueryParam);
    }

    // 批量删除
    @DeleteMapping
    public Object delete(@RequestBody List<Integer> ids) {
        log.info("批量删除:{}", ids);
        diseaseService.delete(ids);
        return null;
    }


}
