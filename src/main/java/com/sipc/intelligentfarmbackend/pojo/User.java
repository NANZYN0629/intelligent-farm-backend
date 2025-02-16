package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id; //用户id
    private String name; //姓名
    private String userName; //用户名
    private Integer roleId; //角色id
    private String userPhone; //手机号
    private String company; //公司名
    private String companyPhone; //公司电话
    private String password; //密码
    private String imgUrl; //头像
}
