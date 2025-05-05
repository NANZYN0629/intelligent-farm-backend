package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductionForecast {
    private Integer id; // 预测结果id
    private Integer fieldId; // 预测结果所属田块id
    private BigDecimal production; // 预测结果
}
