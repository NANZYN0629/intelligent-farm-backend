package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//分页结果封装
public class PageResult<T> {
    private Long total; // 总记录数
    private List<T> rows; // 结果数据
}
