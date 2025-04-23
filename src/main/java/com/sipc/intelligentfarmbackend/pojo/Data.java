package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor

public class Data {
    private Integer fieldId; // 农场id
    private Integer light;  // 光照
    private BigDecimal co2; // co2
    private BigDecimal temperature; // 温度
    private BigDecimal ph; // ph
    private BigDecimal nitrogen; // 氮

}
