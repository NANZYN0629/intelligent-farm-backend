package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.sipc.intelligentfarmbackend.pojo.LoginInfo;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    //分页查询
    PageResult<User> page(UserQueryParam userQueryParam);
}
