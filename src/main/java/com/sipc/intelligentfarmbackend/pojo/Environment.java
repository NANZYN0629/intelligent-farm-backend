package com.sipc.intelligentfarmbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Environment {
    private Integer id; // 主键id
    private Integer fieldId; // 农场id
    private BigDecimal nitrogen; // 氮
    private BigDecimal potassium; // 钾
    private BigDecimal moisture; // 湿度
    private BigDecimal light; // 光
    private BigDecimal phosphorus; // 磷
    private BigDecimal temperature; // 温度
    private BigDecimal ph; // ph
    private BigDecimal co2; // co2
}
