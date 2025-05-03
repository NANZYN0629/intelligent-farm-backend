package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Field;

import java.util.List;

public interface FieldService {

    // 查询所有地块
    public List<Field> findAll();

    // 根据id查询地块
    public List<Field> getById(Integer id);

    // 增加地块
    Field add(Field field);

    // 根据id删除地块
    void deleteById(Integer id);

    // 根据id修改地块信息
    void update(Field field);
}