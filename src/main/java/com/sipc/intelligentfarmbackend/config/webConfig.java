//package com.sipc.intelligentfarmbackend.config;
//
//import com.sipc.intelligentfarmbackend.interceptor.TokenInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class webConfig implements WebMvcConfigurer {
//    @Autowired
//    private TokenInterceptor tokenInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 拦截所有请求
//        registry.addInterceptor(tokenInterceptor).addPathPatterns("/**");
//    }
//}
