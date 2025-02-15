package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Role;

import java.util.List;

public interface RoleService {
    // 查询所有角色
    public List<Role> findAll();

    // 删除角色
    public void deleteById(Integer id);

    // 添加角色
    void add(Role role);

    // 根据id查询角色 (用于修改角色时查询角色信息)
    Role getById(Integer id);

    // 修改角色
    void update(Role role);
}
