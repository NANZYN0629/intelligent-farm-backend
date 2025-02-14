package com.sipc.intelligentfarmbackend.controller;

import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.pojo.Role;
import com.sipc.intelligentfarmbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/role")
    public Result list() {
        List<Role> rolelist = roleService.findAll();
        return Result.success(rolelist);
    }
}
