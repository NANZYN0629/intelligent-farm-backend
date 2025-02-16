package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQueryParam {
    private Integer page = 1; // 当前页码
    private Integer pageSize = 10; // 每页显示条数
    private String name; // 姓名
    private String company; // 公司
    private String companyPhone; // 公司电话
    private String userPhone; // 电话
}
