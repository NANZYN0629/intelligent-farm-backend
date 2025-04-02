package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.pojo.MqttConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = MqttConfigurationProperties.class)
public class MqttClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqttClientApplication.class, args);

    }
}
