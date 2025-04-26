package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.PlantLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface PlantLogMapper {



    // 根据田地id查询
    List<PlantLog> getByFieldId(Integer fieldId);


    // 添加种植日志
    void insert(PlantLog plantLog);
}
