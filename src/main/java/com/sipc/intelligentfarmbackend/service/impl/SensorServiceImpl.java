package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.SensorMapper;
import com.sipc.intelligentfarmbackend.pojo.Sensor;
import com.sipc.intelligentfarmbackend.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    private SensorMapper sensorMapper;


    // 通过fieldId获取传感器信息
    @Override
    public Sensor getByFieldId(Integer fieldId) {
        return sensorMapper.getByFieldId(fieldId);
    }

    // 删除传感器信息
    @Override
    public void add(Sensor sensor) {
        sensorMapper.insert(sensor);
    }

    // 删除传感器信息
    @Override
    public void deleteById(Integer id) {
        sensorMapper.deleteById(id);
    }

    // 根据id更新传感器状态
    @Override
    public void update(Sensor sensor) {
        sensorMapper.update(sensor);
    }
}
