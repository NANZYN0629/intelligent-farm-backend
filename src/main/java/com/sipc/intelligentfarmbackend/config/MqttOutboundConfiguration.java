package com.sipc.intelligentfarmbackend.config;


import com.sipc.intelligentfarmbackend.pojo.MqttConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;

@Configuration
public class MqttOutboundConfiguration {

    // mqtt配置
    @Autowired
    private MqttConfigurationProperties mqttConfigurationProperties;

    // mqtt客户端工厂
    @Autowired
    private MqttPahoClientFactory mqttPahoClientFactory;

    // 消息通道
    @Bean
    public MessageChannel mqttOutboundChannel() {
        return new DirectChannel();    // 创建消息通道
    }

    @Bean
    @ServiceActivator(inputChannel = "mqttOutboundChannel")     // 消息处理
    // 消息处理
    public MessageHandler mqttOutboundMessageHandler() {
        // 创建消息处理对象
        MqttPahoMessageHandler mqttPahoMessageHandler = new MqttPahoMessageHandler(mqttConfigurationProperties.getUrl(),
                mqttConfigurationProperties.getPubClientId(), mqttPahoClientFactory);
        mqttPahoMessageHandler.setDefaultQos(0);  // 设置QOS
        mqttPahoMessageHandler.setAsync(true);    // 设置异步
        mqttPahoMessageHandler.setDefaultTopic("default");  // 设置默认主题
        return mqttPahoMessageHandler;  // 返回消息处理对象
    }
}