package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.ProductionForecastService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/productionForecast")
@RestController
public class ProductionForecastController {

    @Autowired
    private ProductionForecastService productionForecastService;

    // 按照地块id查询
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@RequestParam Integer fieldId) {
        log.info("查询地块id=%d的产量预测".formatted(fieldId));
        return Result.success(productionForecastService.getByFieldId(fieldId));
    }


}
