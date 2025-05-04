package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;

import java.util.List;

public interface EnvironmentAlarmService {

    // 获取所有环境报警信息
    List<EnvironmentAlarm> findAll();



}
