package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.EnvironmentAlarmMapper;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EnvironmentAlarmServiceImpl implements EnvironmentAlarmService {

    @Autowired
    private EnvironmentAlarmMapper environmentAlarmMapper;

    // 获取所有警报
    @Override
    public List<EnvironmentAlarm> findAll() {
        return List.of();
    }


}
