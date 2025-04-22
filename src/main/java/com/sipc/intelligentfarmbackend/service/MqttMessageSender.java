package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.service.gateway.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqttMessageSender {
    @Autowired
    private MqttGateway mqttGateway;

    public void sendMsg(String topic, String mag) {
        mqttGateway.sendMsgToMqtt(topic, mag);
    }

    public void sendMsg(String topic, int qos, String msg) {
        mqttGateway.sendMsgToMqtt(topic, qos, msg);
    }
}
