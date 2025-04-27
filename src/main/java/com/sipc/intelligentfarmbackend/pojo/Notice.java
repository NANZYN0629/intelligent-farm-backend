package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    private Integer id;
    private Integer fieldId;
    private String message;
}
