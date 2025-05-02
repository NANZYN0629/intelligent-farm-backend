package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.Sensor;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface SensorMapper {

    // 通过fieldId查询传感器
//    @Select("select * from sensor where field_id=#{fieldId}")
    List<Sensor> getByFieldId(@Param("fieldId") Integer fieldId);

    // 添加传感器
//    @Insert("insert into sensor(field_id, status, sensor_name) values(#{fieldId},#{status},#{sensor_name})")
    void insert(Sensor sensor);

    // 删除传感器
    @Delete("delete from sensor where id=#{id}")
    void deleteById(Integer id);

    // 根据id更新传感器状态
    @Update("update sensor set status=#{status} where id=#{id}")
    void update(Sensor sensor);
}
