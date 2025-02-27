package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.PlantLogMapper;
import com.sipc.intelligentfarmbackend.pojo.PlantLog;
import com.sipc.intelligentfarmbackend.service.PlantLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantLogServiceImpl implements PlantLogService {
    @Autowired
    private PlantLogMapper plantLogMapper;


    // 根据田地id查询
    @Override
    public PlantLog getByFieldId(Integer fieldId) {
        return plantLogMapper.getByFieldId(fieldId);
    }

    // 添加种植日志
    @Override
    public void add(PlantLog plantLog) {
        plantLogMapper.insert(plantLog);
    }
}
