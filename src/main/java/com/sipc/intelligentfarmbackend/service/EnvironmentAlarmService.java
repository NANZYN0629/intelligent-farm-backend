package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmQueryParam;
import com.sipc.intelligentfarmbackend.pojo.PageResult;

import java.util.List;

public interface EnvironmentAlarmService {

//    // 获取所有环境报警信息
//    List<EnvironmentAlarm> findAll();


    PageResult<EnvironmentAlarm> page(EnvironmentAlarmQueryParam environmentAlarmQueryParam);
}
