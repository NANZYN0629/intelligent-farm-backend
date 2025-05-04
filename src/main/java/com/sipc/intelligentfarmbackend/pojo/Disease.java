package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disease {
    private Integer id; //主键
    private Integer fieldId;   // 字段id
    private LocalDateTime alarmTime;    // 告警时间
    private String status; // 状态
    private String diseaseName; // 病害名称
    private String diseaseImg;  // 病害图片
    private String operation;   // 操作

    private String fieldName;
    private String corpName;
}
