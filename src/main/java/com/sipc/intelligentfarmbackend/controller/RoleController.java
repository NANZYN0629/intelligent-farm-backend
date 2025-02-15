package com.sipc.intelligentfarmbackend.controller;

import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.pojo.Role;
import com.sipc.intelligentfarmbackend.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/role")
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    // 查询所有角色
    @GetMapping
    public Result list() {
        log.info("查询所有角色");
        List<Role> rolelist = roleService.findAll();
        return Result.success(rolelist);
    }

    // 根据id删除角色
    @DeleteMapping
    public Result delete(Integer id) {
        log.info("根据id删除部门，id="+id);
        roleService.deleteById(id);
        return Result.success();
    }

    //增加角色
    @PostMapping
    public Result add(@RequestBody Role role) {
        log.info("增加角色，role="+role);
        roleService.add(role);
        return Result.success();
    }

    // id查询角色 （获取修改角色信息）
    @GetMapping("/{id}")
    public Result getByid(@PathVariable Integer id) {
        log.info("根据id查询角色，id"+id);
        Role role = roleService.getById(id);
        return Result.success(role);
    }

    // 修改角色
    @PutMapping
    public Result update(@RequestBody Role role) {
        log.info("修改角色，role="+role);
        roleService.update(role);
        return Result.success();
    }

}
