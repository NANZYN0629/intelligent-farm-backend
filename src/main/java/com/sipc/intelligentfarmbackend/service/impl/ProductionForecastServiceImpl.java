package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.ProductionForecastMapper;
import com.sipc.intelligentfarmbackend.pojo.ProductionForecast;
import com.sipc.intelligentfarmbackend.service.ProductionForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionForecastServiceImpl implements ProductionForecastService {

    @Autowired
    private ProductionForecastMapper productionForecastMapper;

    // 按照地块id查询
    @Override
    public List<ProductionForecast> getByFieldId(Integer fieldId) {
        return productionForecastMapper.getByFieldId(fieldId);
    }

}
