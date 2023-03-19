package com.zhangxd.demo.design;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
