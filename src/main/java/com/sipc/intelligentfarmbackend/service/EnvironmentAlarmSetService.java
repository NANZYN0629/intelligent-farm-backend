package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmSet;

import java.util.List;

public interface EnvironmentAlarmSetService {

    // 获取指定田地所有环境报警设置
    List<EnvironmentAlarmSet> getByFieldId(Integer fieldId);

    // 添加环境报警设置
    void insert(EnvironmentAlarmSet environmentAlarmSet);

    // 删除指定田地的所有环境报警设置
    void deleteByFieldId(Integer fieldId);

    void update(EnvironmentAlarmSet environmentAlarmSet);
}
