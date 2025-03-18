package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.EnvironmentMapper;
import com.sipc.intelligentfarmbackend.pojo.Environment;
import com.sipc.intelligentfarmbackend.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvironmentServiceImpl implements EnvironmentService {

    @Autowired
    private EnvironmentMapper environmentMapper;


    // 根据田块id查询环境信息
    @Override
    public Environment getByFieldId(Integer fieldId) {
        return environmentMapper.getByFieldId(fieldId);
    }
}
