package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.FieldMapper;
import com.sipc.intelligentfarmbackend.pojo.Field;
import com.sipc.intelligentfarmbackend.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldServiceImpl implements FieldService {

    @Autowired
    private FieldMapper fieldMapper;


    // 查询所有地块
    @Override
    public List<Field> findAll() {
        return fieldMapper.findAll();
    }

    // 添加地块
    @Override
    public void add(Field field) {
        fieldMapper.insert(field);
    }

    // 根据id删除ById
    @Override
    public void deleteById(Integer id) {
        fieldMapper.deleteById(id);
    }


}
