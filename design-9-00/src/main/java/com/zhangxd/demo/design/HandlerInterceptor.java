package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
