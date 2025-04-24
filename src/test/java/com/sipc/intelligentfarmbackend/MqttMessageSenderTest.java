package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.service.impl.MqttSendServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = IntelligentFarmBackendApplication.class)
public class MqttMessageSenderTest {
    @Autowired
    private MqttSendServiceImpl mqttMessageSender;

    @Test
    public void sendMsg() {
        mqttMessageSender.sendMsgToMqtt("atguigu/iot/lamp/line", "你好mqtt！");
    }


}
