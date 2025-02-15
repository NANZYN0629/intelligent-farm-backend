package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.RoleMapper;
import com.sipc.intelligentfarmbackend.pojo.Role;
import com.sipc.intelligentfarmbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    //查询所有角色
    @Autowired
    private RoleMapper roleMapper;

    //查询所有角色
    public List<Role> findAll()
    {
        return roleMapper.findAll();
    }

    //根据id删除角色
    public void deleteById(Integer id) {
        roleMapper.deleteById(id);
    }

    //添加角色
    public void add(Role role) {
        roleMapper.insert(role);
    }

    //根据id查询角色 (用于修改角色)
    public Role getById(Integer id) {
        return roleMapper.getById(id);
    }

    //修改角色
    public void update(Role role) {
        roleMapper.update(role);
    }
}
