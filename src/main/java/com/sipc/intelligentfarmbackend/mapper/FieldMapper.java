package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.Field;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FieldMapper {

    //查询所有地块
//    @Select("select field.id, field.field_name, field.crop_name, field.crop,field.area,field.plant_time from field")
    public List<Field> findAll();

    //根据id查询地块
//    @Select("select * from field where id=#{id}")
    List<Field> getById(Integer id);
    //添加地块
//    @Insert("insert into field(field_name,location,area,crop_name,crop,plant_time) values(#{fieldName},#{location},#{area},#{cropName},#{crop},#{plantTime})")
    void insert(Field field);

    // 根据id删除地块
//    @Delete("delete from field where id=#{id}")
    void deleteById(Integer id);

    // 根据id修改地块信息
//    @Update("update field set area=#{area},crop_name=#{cropName},crop=#{crop},plant_time=#{plantTime} where id=#{id}")
    void update(Field field);

}
