package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnvironmentAlarmMapper {

    List<EnvironmentAlarm> list(EnvironmentAlarmQueryParam environmentAlarmQueryParam);

    void delete(List<Integer> ids);

}