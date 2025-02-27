package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.Field;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FieldMapper {

    //查询所有地块
    @Select("select * from field")
    public List<Field> findAll();

    //添加地块
    @Insert("insert into field(field_name,location,area,crop_name,crop,plant_time) values(#{fieldName},#{location},#{area},#{cropName},#{crop},#{plantTime})")
    void insert(Field field);

    // 根据id删除地块
    @Delete("delete from field where id=#{id}")
    void deleteById(Integer id);
}
