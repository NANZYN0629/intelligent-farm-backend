package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnvironmentAlarmQueryParam {

    private Integer page = 1; // 当前页码
    private Integer pageSize = 10; // 每页显示条数
    private Integer id;     // 主键
    private Integer fieldId;    // 地块id
    private LocalDateTime alarmTime;    // 报警时间
    private String program;     // 报警项目
    private String outlier;     // 异常值
    private String normal;      // 正常值
    private String currentState;    // 当前状态

    private String fieldName;   // 地块名称
    private String cornName;    // 作物名称



}
