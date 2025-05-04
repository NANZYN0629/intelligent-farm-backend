package com.sipc.intelligentfarmbackend.interceptor;

import com.sipc.intelligentfarmbackend.util.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 拦截器


@Component
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1. 获取请求url
        String url = request.getRequestURI().toString();

        // 2. 判断是否是登录请求
        if (url.contains("login")) {
            log.info("登录请求");
            // 如果是登录请求，放行
            return true;
        }

        // 3. 获取请求头中的token
        String token = request.getHeader("token");

        // 4. 判断token是否为空,如果为空，则返回错误信息
        if(!StringUtils.hasLength(token)){
            log.info("令牌为空");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }

        // 5. 解析token,如果解析失败，则返回错误信息
        try {
            JwtUtils.parseJwt(token);
        } catch (Exception e) {
            // 如果解析失败，则返回错误信息
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }


        // 6. 放行
        log.info("放行");
        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        log.info("postHandle...");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("afterCompletion...");
//    }




}
