package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.pojo.LoginInfo;
import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sipc.intelligentfarmbackend.mapper.UserMapper;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import com.sipc.intelligentfarmbackend.service.UserService;
import com.sipc.intelligentfarmbackend.util.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // 获取用户名密码
    @Override
    public User getUsernameAndPassword(User user) {
        return userMapper.getUsernameAndPassword(user);
    }


    // 登录
    @Override
    public LoginInfo login(User user) {
        User userLogin = userMapper.getUsernameAndPassword(user);
        if(userLogin != null){
            // 1. 生成jwt令牌
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("id", userLogin.getId());
            dataMap.put("user_name", userLogin.getUserName());

            String jwt = JwtUtils.genJwt(dataMap);
            LoginInfo loginInfo = new LoginInfo(userLogin.getId(), userLogin.getUserName(), userLogin.getName(), jwt);
            return loginInfo;
        }

        return null;

    }


    // 添加用户
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

}
