package com.sipc.intelligentfarmbackend.handler;

import com.alibaba.fastjson.JSON;
import com.sipc.intelligentfarmbackend.mapper.EnvironmentMapper;
import com.sipc.intelligentfarmbackend.pojo.Environment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
//public class ReceiverMessageHandler implements MessageHandler {
//
//
//    @Override
//    public void handleMessage(Message<?> message) throws MessagingException {
//
//        Object payload = message.getPayload();
//        System.out.println(payload);
//        System.out.println(message);
//
//        MessageHeaders headers = message.getHeaders();
//        String topicName = headers.get("mqtt_receivedTopic").toString();
//        System.out.println("topicName:" + topicName);
//
//
//    }
//
//}

@Slf4j
@Component
public class ReceiverMessageHandler implements MessageHandler {

    @Autowired
    private EnvironmentMapper environmentMapper;

    @Override
    public void handleMessage(Message<?> message) {
        try {
            String payload = message.getPayload().toString();
            MessageHeaders headers = message.getHeaders();
            String topic = headers.get("mqtt_receivedTopic", String.class);

            Environment envData = JSON.parseObject(payload, Environment.class);

            int affectedRows = environmentMapper.insertEnvironment(envData);
            log.info("环境数据入库{} | 主题:{} | 影响行数:{}",
                    affectedRows > 0 ? "成功" : "失败", topic, affectedRows);

        } catch (Exception e) {
            log.error("消息处理异常: ", e);
            throw new MessagingException("数据处理失败", e);
        }
    }
}