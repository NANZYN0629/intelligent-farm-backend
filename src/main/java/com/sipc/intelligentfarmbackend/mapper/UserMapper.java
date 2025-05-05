package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {

    // 根据id查询用户
    User getUser(Integer id);

    // 根据用户名查询用户
    User getUsernameAndPassword(User user);

    // 添加用户
    void add(User user);

    // 修改用户
    void update(User user);



}
