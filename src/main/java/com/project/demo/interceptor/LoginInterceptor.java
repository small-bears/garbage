package com.project.demo.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    private String tokenName = "x-auth-token";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(this.tokenName);

        setHeader(request, response);
        log.info("[请求接口] - {} , [请求类型] - {}",request.getRequestURL().toString(),request.getMethod());
        if (request.getRequestURL().toString().contains("/api/user/login")){
            return true;
        }
        else if (request.getRequestURL().toString().contains("/api/user/state")){
            return true;
        }
        else if (request.getRequestURL().toString().contains("/api/user/register")){
            return true;
        }
        if (token == null || "".equals(token)){
            if ("POST".equals(request.getMethod())){
                return false;
            }else {
                return true;
            }
        }else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        //更新token
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    private void failure(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setStatus(401);
//        response.getWriter().write("");
        response.sendRedirect("https://www.baidu.com");
    }

    private void setHeader(HttpServletRequest request, HttpServletResponse response) {
        //跨域的header设置
        response.setHeader("Access-control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
        response.setHeader("Access-Control-Max-Age", "1800");
        //防止乱码，适用于传输JSON数据
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setStatus(HttpStatus.OK.value());
    }

}
