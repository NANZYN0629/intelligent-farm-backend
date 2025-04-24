package com.sipc.intelligentfarmbackend.service;


import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttSendService {

    // 发送消息到MQTT
    public abstract void sendMsgToMqtt(
            @Header(value = MqttHeaders.TOPIC) String topic,    // 主题
            String payload);    // 消息

    // 发送消息
    public abstract void sendMsgToMqtt(
            @Header(value = MqttHeaders.TOPIC) String topic,    // 主题
            @Header(value = MqttHeaders.QOS) int qos, String payload);  // 消息

}