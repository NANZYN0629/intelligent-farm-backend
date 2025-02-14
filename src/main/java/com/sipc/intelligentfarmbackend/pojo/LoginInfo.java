package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 登录信息
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {
    private Integer id; //用户id
    private String user_name; //用户名
    private String name; //项目
    private String token; //令牌
}
