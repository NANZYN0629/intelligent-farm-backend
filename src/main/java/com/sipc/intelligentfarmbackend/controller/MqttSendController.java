package com.sipc.intelligentfarmbackend.controller;

// mqtt 发送控制层

import com.sipc.intelligentfarmbackend.service.MqttSendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class MqttSendController {
    @Autowired
    private MqttSendService mqttSendService;

    // 固定主题和消息内容
//    private static final String FIXED_TOPIC = "atguigu/iot/lamp/line";

    private static final String FIXED_TOPIC = "/mysmartagriculture/sub";
    private static final String FIXED_MESSAGE = "{\"dianji_sw\":1}";;


    @PostMapping("/water")
    public void sendFixedMsg() {
        mqttSendService.sendMsgToMqtt(FIXED_TOPIC, FIXED_MESSAGE);
        log.info("已发送固定消息至MQTT: topic={}, message={}", FIXED_TOPIC, FIXED_MESSAGE);
    }


}
