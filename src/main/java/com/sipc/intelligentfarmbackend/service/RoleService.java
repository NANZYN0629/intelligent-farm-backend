package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Role;

import java.util.List;

public interface RoleService {
    // 查询所有角色
    public List<Role> findAll();
}
