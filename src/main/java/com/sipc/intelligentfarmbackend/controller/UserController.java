package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.PageResult;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.pojo.User;
import com.sipc.intelligentfarmbackend.pojo.UserQueryParam;
import com.sipc.intelligentfarmbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // 用户列表分页查询
    @GetMapping
    public Result page(UserQueryParam userQueryParam){
        log.info("用户列表分页查询:{}",userQueryParam);
        PageResult<User> pageResult = userService.page(userQueryParam);
        return Result.success(pageResult);
    }
}
