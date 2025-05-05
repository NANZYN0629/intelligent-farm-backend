package com.sipc.intelligentfarmbackend.service;


import com.sipc.intelligentfarmbackend.pojo.ProductionForecast;

import java.util.List;

public interface ProductionForecastService {

    // 按照地块id查询
    List<ProductionForecast> getByFieldId(Integer fieldId);


}
