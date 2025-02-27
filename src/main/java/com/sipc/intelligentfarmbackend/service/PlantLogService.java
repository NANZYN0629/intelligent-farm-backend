package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.PlantLog;

public interface PlantLogService {

    // 根据田地id查询
    PlantLog getByFieldId(Integer fieldId);

    // 添加种植日志
    void add(PlantLog plantLog);
}
