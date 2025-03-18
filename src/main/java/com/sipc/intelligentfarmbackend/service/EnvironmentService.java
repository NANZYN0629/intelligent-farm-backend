package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Environment;

public interface EnvironmentService {

    // 根据fieldId查询环境信息
    Environment getByFieldId(Integer fieldId);
}
