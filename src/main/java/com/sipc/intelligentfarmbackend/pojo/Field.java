package com.sipc.intelligentfarmbackend.pojo;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

// 地块

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Field {
    private Integer id; // 地块id
    private String fieldName; // 地块名称
    private String location; // 地块位置
    private BigDecimal area; // 地块面积
    private String cropName; // 种植作物名称
    private String crop; // 种植作物品种
    private LocalDate plantTime; // 种植时间
}
