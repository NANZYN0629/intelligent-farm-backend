package com.sipc.intelligentfarmbackend.config;


import com.sipc.intelligentfarmbackend.pojo.MqttConfigurationProperties;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;

// MQTT 链接工厂配置

@Configuration
public class MqttConfiguration {
    @Autowired
    private MqttConfigurationProperties mqttConfigurationProperties;

    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        // 创建 MQTT 客户端工厂
        DefaultMqttPahoClientFactory mqttPahoClientFactory = new DefaultMqttPahoClientFactory();
        // 设置 MQTT 连接选项
        MqttConnectOptions options = new MqttConnectOptions();
        // 设置 MQTT 连接选项
        options.setCleanSession(true); // 设置是否清除会话
        options.setUserName(mqttConfigurationProperties.getUsername()); // 设置用户名
        options.setPassword(mqttConfigurationProperties.getPassword().toCharArray());   // 设置密码
        options.setServerURIs(new String[] {mqttConfigurationProperties.getUrl() } );   // 设置服务器地址

        // MqttConfiguration.java
        options.setKeepAliveInterval(60);
        options.setAutomaticReconnect(true); // 自动重连
        options.setConnectionTimeout(30); // 连接超时30秒

        mqttPahoClientFactory.setConnectionOptions(options); // 设置 MQTT 连接选项
        return mqttPahoClientFactory;  // 返回 MQTT 客户端工厂
    }
}
