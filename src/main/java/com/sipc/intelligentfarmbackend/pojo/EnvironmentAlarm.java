package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvironmentAlarm {
    private Integer id;     // 主键
    private Integer fieldId;    // 地块id
    private LocalDateTime alarmTime;    // 报警时间
    private String program;     // 报警项目
    private String outlier;     // 异常值
    private String normal;      // 正常值
    private String currentStatus;    // 当前状态

    private String fieldName;
    private String corpName;

}
