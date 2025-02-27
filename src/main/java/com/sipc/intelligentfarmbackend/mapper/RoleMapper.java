package com.sipc.intelligentfarmbackend.mapper;

import com.sipc.intelligentfarmbackend.pojo.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询所有角色
//    @Select("select * from role")
    public List<Role> findAll();

    //删除角色
//    @Delete("delete from role where id = #{id}")
    public void deleteById(Integer id);

    //添加角色
//    @Insert("insert into role(id, role_name) values(#{id}, #{roleName})")
    void insert(Role role);

    //根据id查询角色 (用于修改角色)
//    @Select("select * from role where id = #{id}")
    Role getById(Integer id);

    //修改角色
//    @Insert("update role set role_name = #{roleName} where id = #{id}")
    void update(Role role);
}
