package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.PlantLog;

import java.util.List;

public interface PlantLogService {

    // 根据田地id查询
    List<PlantLog> getByFieldId(Integer fieldId);

    // 添加种植日志
    void add(PlantLog plantLog);
}
