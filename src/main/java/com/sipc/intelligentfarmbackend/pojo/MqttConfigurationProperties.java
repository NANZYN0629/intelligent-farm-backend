package com.sipc.intelligentfarmbackend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "spring.mqtt")
public class MqttConfigurationProperties {
    private String username;    // 用户名
    private String password;    // 密码
    private String url;     // 连接地址
    private String subClientId;     // 订阅客户端ID
    private String subTopic;    // 订阅主题
    private String pubClientId;     // 发布客户端
}
