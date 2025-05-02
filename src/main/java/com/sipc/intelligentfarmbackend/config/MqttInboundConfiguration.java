package com.sipc.intelligentfarmbackend.config;

import com.sipc.intelligentfarmbackend.handler.ReceiverMessageHandler;
import com.sipc.intelligentfarmbackend.pojo.MqttConfigurationProperties;
import org.springframework.messaging.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;


// MQTT 订阅主题及发送信息
@Configuration
public class MqttInboundConfiguration {

    // MQTT 配置
    @Autowired
    private MqttConfigurationProperties mqttConfigurationProperties;

    // MQTT 客户端工厂
    @Autowired
    private MqttPahoClientFactory mqttPahoClientFactory;

    // 接收消息的处理器
    @Autowired
    private ReceiverMessageHandler receiverMessageHandler;

    // 消息通道
    @Bean
    public MessageChannel messageInboundChannel() {
        return new DirectChannel();
    }

    // 配置入站适配器，作用，设置订阅的主题，以及指定消息的相关属性
    @Bean
    public MessageProducer messageInboundAdapter() {
        MqttPahoMessageDrivenChannelAdapter mqttPahoMessageDrivenChannelAdapter
                = new MqttPahoMessageDrivenChannelAdapter(
                mqttConfigurationProperties.getUrl(),   // MQTT服务器地址
                mqttConfigurationProperties.getSubClientId(), // 客户端ID
                mqttPahoClientFactory,  // 客户端工厂
                mqttConfigurationProperties.getSubTopic().split(",")    // 订阅的主题
        );


        mqttPahoMessageDrivenChannelAdapter.setQos(1);  // 设置QOS
        mqttPahoMessageDrivenChannelAdapter.setConverter(new DefaultPahoMessageConverter());    // 设置消息转换器
        mqttPahoMessageDrivenChannelAdapter.setOutputChannel(messageInboundChannel());  // 设置消息通道
        return mqttPahoMessageDrivenChannelAdapter; // 返回适配器
    }


    // 消息处理器
    @Bean
    @ServiceActivator(inputChannel = "messageInboundChannel")
    public MessageHandler messageHandler() {
        return receiverMessageHandler;  // 返回消息处理器
    }


}
