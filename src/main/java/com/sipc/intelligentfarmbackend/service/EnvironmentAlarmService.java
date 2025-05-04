package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmQueryParam;
import com.sipc.intelligentfarmbackend.pojo.PageResult;

import java.util.List;

public interface EnvironmentAlarmService {

    PageResult<EnvironmentAlarm> page(EnvironmentAlarmQueryParam environmentAlarmQueryParam);

    void delete(List<Integer> id);

}
