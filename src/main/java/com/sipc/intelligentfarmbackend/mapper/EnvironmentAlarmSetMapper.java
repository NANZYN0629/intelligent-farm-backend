package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarmSet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnvironmentAlarmSetMapper {

    // 根据fieldId查询EnvironmentAlarmSet
    List<EnvironmentAlarmSet> getByFieldId(Integer fieldId);

    // 增加EnvironmentAlarmSet
    void insert(EnvironmentAlarmSet environmentAlarmSet);
}
