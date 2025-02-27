package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 传感器

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sensor {
    private Integer id; // 传感器id
    private Integer fieldId; // 地块id
    private Integer status; // 状态
    private String sensorName; // 传感器名称
}
