package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.ProductionForecast;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductionForecastMapper {

    List<ProductionForecast> getByFieldId(Integer fieldId);
}
