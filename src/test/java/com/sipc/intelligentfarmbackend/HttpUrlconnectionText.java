package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.JavaToPython.HttpUrlconnection;
import org.junit.jupiter.api.Test;

public class HttpUrlconnectionText {

    @Test
    public void connectionText() {
        // 定义Python接口的URL
        String url = "http://example.com/python-api-endpoint";
        
        // 定义要发送的JSON数据
        String jsonData = "{\"key\": \"value\"}";
        
        // 使用HttpUrlconnection类中的doJsonPost方法发送请求
        String response = HttpUrlconnection.doJsonPost(url, jsonData);
        
        // 打印服务器返回的响应
        System.out.println("Response from Python API: " + response);
    }
}