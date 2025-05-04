package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnvironmentAlarmMapper {



    List<EnvironmentAlarm> findAll();
}
