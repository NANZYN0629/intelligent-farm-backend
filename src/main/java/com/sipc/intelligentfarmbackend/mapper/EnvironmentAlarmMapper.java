package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmQueryParam;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnvironmentAlarmMapper {



//    List<EnvironmentAlarm> findAll();


    // 分页查询
    List<EnvironmentAlarm> list(EnvironmentAlarmQueryParam environmentAlarmQueryParam);
}
