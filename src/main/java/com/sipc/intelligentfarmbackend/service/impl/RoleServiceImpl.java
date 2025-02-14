package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.RoleMapper;
import com.sipc.intelligentfarmbackend.pojo.Role;
import com.sipc.intelligentfarmbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> findAll()
    {
        return roleMapper.findAll();
    }

}
