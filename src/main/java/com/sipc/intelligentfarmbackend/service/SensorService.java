package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Sensor;

import java.util.List;

public interface SensorService {
    List<Sensor> getByFieldId(Integer fieldId);

    // 新增传感器
    void add(Sensor sensor);

    // 删除传感器
    void deleteById(Integer id);

    // 根据id修改传感器状态
    void update(Sensor sensor);
}
