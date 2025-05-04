package com.sipc.intelligentfarmbackend.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sipc.intelligentfarmbackend.mapper.DiseaseMapper;
import com.sipc.intelligentfarmbackend.pojo.Disease;
import com.sipc.intelligentfarmbackend.pojo.DiseaseQueryParam;
import com.sipc.intelligentfarmbackend.pojo.EnvironmentAlarm;
import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.sipc.intelligentfarmbackend.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    private DiseaseMapper diseaseMapper;

    // 分页查询
    @Override
    public PageResult<Disease> page(DiseaseQueryParam diseaseQueryParam) {

        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(diseaseQueryParam.getPage(), diseaseQueryParam.getPageSize());

        //2. 执行查询
        List<Disease> diseaseList = diseaseMapper.list(diseaseQueryParam);

        //3. 解析查询结果, 并封装
        Page<Disease> p = (Page<Disease>)diseaseList;
        return new PageResult<Disease>( p.getTotal(), p.getResult());
    }





}
