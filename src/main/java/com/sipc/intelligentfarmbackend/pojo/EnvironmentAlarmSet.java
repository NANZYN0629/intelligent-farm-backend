package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnvironmentAlarmSet {

    private Integer id; // 环境报警设置id
    private Integer fieldId; // 地块id
    private String program; // 报警项目
    private BigDecimal max; // 最大值
    private BigDecimal min; // 最小值

}
