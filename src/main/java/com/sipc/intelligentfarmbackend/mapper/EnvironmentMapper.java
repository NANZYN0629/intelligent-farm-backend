package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.Environment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EnvironmentMapper {


    // 根据fieldId查询环境信息
//    @Select("select * from environment where field_id=#{fieldId}")
    Environment getByFieldId(Integer fieldId);

    // 新增插入方法
    int insertEnvironment(Environment environment);



}
