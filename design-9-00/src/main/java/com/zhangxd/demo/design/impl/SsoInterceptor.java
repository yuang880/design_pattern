package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.HandlerInterceptor;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
public class SsoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(String request, String response, Object handler) {

        String ticket = request.substring(1, 8);
        return "success".equals(ticket);
    }
}
