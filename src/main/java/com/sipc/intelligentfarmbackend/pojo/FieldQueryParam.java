package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// 地块分页查询参数


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldQueryParam {
    private Integer id; // 地块id
    private String plantName; // 种植名称
    private BigDecimal area; // 种植面积
    private LocalDateTime plantTime; // 种植时间


}
