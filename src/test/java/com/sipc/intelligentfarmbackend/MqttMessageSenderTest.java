package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.service.MqttMessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = MqttClientApplication.class)
public class MqttMessageSenderTest {
    @Autowired
    private MqttMessageSender mqttMessageSender;


    @Test
    public void sendMsg() {
        mqttMessageSender.sendMsg("/mysmartagriculture/pub", "{\n" +
                "  \"Carbon_Dioxide\": 1023,\n" +
                "  \"Temperature_Value\": 211.0,\n" +
                "  \"Water_Value\": 4.0,\n" +
                "  \"Conductivity\":5.0,\n" +
                "  \"PH\": 3.0,\n" +
                "  \"Light_Disp\": 2650,\n" +
                "  \"humi_val\": 15,\n" +
                "  \"temp_val\": 43\n" +
                "}");
    }


}
