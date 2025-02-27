package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Field;

import java.util.List;

public interface FieldService {

    // 查询所有地块
    public List<Field> findAll();

    // 增加地块
    void add(Field field);

    // 根据id删除地块
    void deleteById(Integer id);
}
