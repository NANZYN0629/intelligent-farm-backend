package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    // 在UserController中添加登录接口
    @PostMapping("/login")
        public Result login(@RequestBody User user) {
        log.info("用户登录: {}", user.getUserName());
        LoginInfo loginInfo = userService.login(user);
        return Result.success(loginInfo);
    }

}
