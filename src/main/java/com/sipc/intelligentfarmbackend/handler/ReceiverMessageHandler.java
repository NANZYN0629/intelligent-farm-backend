package com.sipc.intelligentfarmbackend.handler;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class ReceiverMessageHandler implements MessageHandler {


    @Override
    public void handleMessage(Message<?> message) throws MessagingException {

        Object payload = message.getPayload();
        System.out.println(payload);
        System.out.println(message);

        MessageHeaders headers = message.getHeaders();
        String topicName = headers.get("mqtt_receivedTopic").toString();
        System.out.println("topicName:" + topicName);


    }

}


// ReceiverMessageHandler.java 修改后
//@Component
//public class ReceiverMessageHandler implements MessageHandler {
//
//    @Autowired
//    private MqttMessageMapper mqttMessageMapper;
//
//    @Override
//    public void handleMessage(Message<?> message) throws MessagingException {
//        try {
//            // 解析消息
//            String payload = message.getPayload().toString();
//            MessageHeaders headers = message.getHeaders();
//            String topic = headers.get("mqtt_receivedTopic", String.class);
//
//            // 构建存储对象
//            MqttMessage msg = new MqttMessage();
//            msg.setTopic(topic);
//            msg.setPayload(payload);
//            msg.setCreateTime(LocalDateTime.now());
//
//            // 存储到数据库
//            int result = mqttMessageMapper.insertMessage(msg);
//            System.out.println("存储结果：" + (result > 0 ? "成功" : "失败"));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new MessagingException("消息处理失败", e);
//        }
//    }
//}

