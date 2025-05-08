package com.sipc.intelligentfarmbackend.config;

import com.sipc.intelligentfarmbackend.pojo.MqttConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class MqttConfigValidator {

    public MqttConfigValidator(MqttConfigurationProperties properties) {
        System.out.println("MQTT Configuration: " + properties);
    }
}
