package com.zhangxd.demo.design;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@Slf4j
public class LoginSsoDecorator extends SsoDecorator{

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor){
        super(handlerInterceptor);
    }


    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success) return false;
        String userId = request.substring(8);
        String method = authMap.get(userId);
        log.info("模拟单点登录方法访问拦截校验：{} {}", userId, method);
        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
