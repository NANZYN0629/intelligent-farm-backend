package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.ProductionForecast;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.ProductionForecastService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/productionForecast")
@RestController
public class ProductionForecastController {

    @Autowired
    private ProductionForecastService productionForecastService;

    // 按照地块id查询
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
        log.info("查询地块id={}的产量预测", fieldId);
        List<ProductionForecast> productionForecast = productionForecastService.getByFieldId(fieldId);

        return Result.success(productionForecastService.getByFieldId(fieldId));
    }


}
