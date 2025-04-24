package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.service.MqttSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MqttSendServiceImpl implements MqttSendService {

    @Autowired
    private MqttSendService mqttSendService;

    public void sendMsgToMqtt(String topic, String mag) {
        mqttSendService.sendMsgToMqtt(topic, mag);
    }

    public void sendMsgToMqtt(String topic, int qos, String msg) {
        mqttSendService.sendMsgToMqtt(topic, qos, msg);
    }


}
