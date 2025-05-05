package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.sipc.intelligentfarmbackend.pojo.LoginInfo;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    // 获取用户
    User getUser(Integer id);

    // 获取用户名和密码
    User getUsernameAndPassword(User user);

    // 登录
    LoginInfo login(User user);

    void add(User user);

    void update(User user);


}
