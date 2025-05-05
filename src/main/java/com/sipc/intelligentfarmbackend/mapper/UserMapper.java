package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {

    // 条件查询用户列表
//    @Select("select u.*, r.role_name from user u left join role r on u.role_id = r.id")
    public List<User> list(UserQueryParam userQueryParam);

    User getUsernameAndPassword(User user);

    void insert(User user);
}
