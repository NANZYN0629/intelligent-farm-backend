package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.EnvironmentAlarmSetMapper;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmSet;
import com.sipc.intelligentfarmbackend.service.EnvironmentAlarmSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvironmentAlarmSetServiceImpl implements EnvironmentAlarmSetService {

    @Autowired
    private EnvironmentAlarmSetMapper environmentAlarmSetMapper;


    // 根据fieldId查询环境报警设置
    @Override
    public List<EnvironmentAlarmSet> getByFieldId(Integer fieldId) {
        return environmentAlarmSetMapper.getByFieldId(fieldId);
    }

    // 插入环境报警设置
    @Override
    public void insert(EnvironmentAlarmSet environmentAlarmSet) {
        environmentAlarmSetMapper.insert(environmentAlarmSet);
    }

    @Override
    public void deleteByFieldId(Integer fieldId) {
        environmentAlarmSetMapper.deleteByFieldId(fieldId);
    }

    @Override
    public void update(EnvironmentAlarmSet environmentAlarmSet) {
        environmentAlarmSetMapper.update(environmentAlarmSet);
    }

}
