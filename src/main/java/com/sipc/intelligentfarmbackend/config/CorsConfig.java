package com.sipc.intelligentfarmbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 用于配置跨域资源共享 (CORS) 的配置文件

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 允许所有路径
                .allowedOrigins("http://localhost:8081") // 你的前端地址（注意不要带斜杠）
                .allowedMethods("*")    // 允许所有HTTP方法（GET/POST等）
                .allowedHeaders("*", "Authorization")    // 允许所有请求头
                .allowCredentials(true)     // 允许携带cookie等凭证
                .exposedHeaders("Authorization")
                .maxAge(3600);      // 预检请求缓存1小时
    }
}