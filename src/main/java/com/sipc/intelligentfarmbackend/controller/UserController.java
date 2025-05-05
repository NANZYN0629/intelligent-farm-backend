package com.sipc.intelligentfarmbackend.controller;


import com.sipc.intelligentfarmbackend.pojo.*;
import com.sipc.intelligentfarmbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    // 查询用户信息
    @GetMapping("/user")
    public Result getUser(@RequestParam Integer id) {
        log.info("查询用户信息，id={}", id);
        User user = userService.getUser(id);
        return Result.success(user);
    }


    // 在UserController中添加登录接口
    @PostMapping("/login")
        public Result login(@RequestBody User user) {
        log.info("用户登录: {}", user.getUserName());
        LoginInfo loginInfo = userService.login(user);
        return Result.success(loginInfo);
    }

    // 注册增加用户
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        log.info("用户注册: {}", user.getUserName());
        userService.add(user);
        return Result.success();
    }

    // 更新用户信息
    @PutMapping("/user")
    public Result update(@RequestBody User user) {
        log.info("更新用户信息: {}", user.getUserName());
        userService.update(user);
        return Result.success();
    }

}
