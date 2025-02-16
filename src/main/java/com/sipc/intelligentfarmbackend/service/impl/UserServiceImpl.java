package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sipc.intelligentfarmbackend.mapper.UserMapper;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import com.sipc.intelligentfarmbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 列表查询用户
    @Override
    public PageResult<User> page(UserQueryParam userQueryParam) {
        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(userQueryParam.getPage(), userQueryParam.getPageSize());

        //2. 执行查询
        List<User> userList = userMapper.list(userQueryParam);

        //3. 解析查询结果, 并封装
        Page<User> p = (Page<User>)userList;
        return new PageResult<User>( p.getTotal(), p.getResult());
    }

}
