package com.sipc.intelligentfarmbackend;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnect;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.junit.jupiter.api.Test;

public class MqttPahoTest {
     // mqtt发送消息
    @Test
    public void createConnection() throws MqttException {
        // 定义连接参数
        String serverURL = "tcp://broker.emqx.io:1883";
        String clientId = "mqttx_e1b0afc0";

        // 创建一个MqttClient实例，并设置连接参数
        MqttClient mqttClient = new MqttClient(serverURL, clientId, new MemoryPersistence());

        // 创建MqttConnectOptions对象，并设置连接选项
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setUserName("nan");
        mqttConnectOptions.setPassword("123".toCharArray());
        mqttConnectOptions.setCleanSession(true);

        // 连接到服务器
        mqttClient.connect(mqttConnectOptions);
        System.out.println("建立连接成功");


        // 创建MqttMessage，并设置消息内容
        MqttMessage mqttMessage = new MqttMessage();
        mqttMessage.setQos(0); // 设置QoS级别
        mqttMessage.setRetained(true); // 设置保留消息
        mqttMessage.setPayload("Hello, 金威".getBytes()); // 设置消息内容

        // 发布消息
        mqttClient.publish("/mysmartagriculture/pub", mqttMessage);

        // 关闭连接
        mqttClient.disconnect();
        mqttClient.close();
        System.out.println("关闭连接");
    }


    // mqtt订阅消息
    @Test
    public void receviceConnection() throws MqttException, InterruptedException {
        // 定义连接参数
        String serverURL = "tcp://broker.emqx.io:1883";
        String clientId = "mqttx_e1b0afc0";

        // 创建一个MqttClient实例，并设置连接参数
        MqttClient mqttClient = new MqttClient(serverURL, clientId, new MemoryPersistence());

        // 创建MqttConnectOptions对象，并设置连接选项
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setKeepAliveInterval(60);
        mqttConnectOptions.setUserName("nan");
        mqttConnectOptions.setPassword("123".toCharArray());
        mqttConnectOptions.setCleanSession(true);


        // 设置订阅回调函数
        mqttClient.setCallback(new MqttCallback() {


            @Override
            public void connectionLost(Throwable throwable) {
                System.out.println("连接断开，原因：" + throwable.getMessage());
            }

            @Override
            public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
                System.out.println("topic --->"+s);
                byte[] payload = mqttMessage.getPayload();
                System.out.println("message --->"+new String(payload));
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
                System.out.println("消息发送完成");
            }
        });


        // 连接到服务器
        mqttClient.connect(mqttConnectOptions);
        System.out.println("建立连接成功");

        // 订阅主题
        mqttClient.subscribe("/mysmartagriculture/pub", 0);
        System.out.println("订阅成功");

        // 阻塞线程，防止程序退出
        while (true);

    }
}
