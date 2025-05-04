package com.sipc.intelligentfarmbackend.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sipc.intelligentfarmbackend.mapper.EnvironmentAlarmMapper;
import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EnvironmentAlarmServiceImpl implements EnvironmentAlarmService {

    @Autowired
    private EnvironmentAlarmMapper environmentAlarmMapper;

//    // 获取所有警报
//    @Override
//    public List<EnvironmentAlarm> findAll() {
//        return List.of();
//    }


    @Override
    public PageResult<EnvironmentAlarm> page(EnvironmentAlarmQueryParam environmentAlarmQueryParam) {
        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(environmentAlarmQueryParam.getPage(), environmentAlarmQueryParam.getPageSize());

        //2. 执行查询
        List<EnvironmentAlarm> environmentAlarmList = environmentAlarmMapper.list(environmentAlarmQueryParam);

        //3. 解析查询结果, 并封装
        Page<EnvironmentAlarm> p = (Page<EnvironmentAlarm>)environmentAlarmList;

        return new PageResult<EnvironmentAlarm>( p.getTotal(), p.getResult());
    }




}
