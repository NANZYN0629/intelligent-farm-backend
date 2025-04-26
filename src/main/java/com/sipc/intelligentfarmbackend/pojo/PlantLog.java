package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// 种植日志

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlantLog {
    private Integer id; //记录id
    private Integer fieldId; // 地块id
    private Integer userId; // 用户id
    private LocalDateTime logTime; // 记录时间
    private String work; // 工作内容
    private String remark; // 备注
    // 非数据库字段
    private String fieldName; // 地块名称
    private String userName; // 用户姓名
    private String userPhone; // 用户电话
}
