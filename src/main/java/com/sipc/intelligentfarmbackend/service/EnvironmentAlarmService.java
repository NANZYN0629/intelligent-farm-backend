package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;

import java.util.List;

public interface EnvironmentAlarmService {

    // 获取所有环境报警信息
    public List<EnvironmentAlarm> findAll();


    // 获取所有警报
    List<EnvironmentAlarm> getAll();
}
