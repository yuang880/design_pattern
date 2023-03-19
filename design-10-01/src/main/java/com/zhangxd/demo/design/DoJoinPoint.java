package com.zhangxd.demo.design;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.annocation.DoDoor;
import com.zhangxd.demo.design.config.StarterService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.apache.bcel.generic.RET;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@Aspect
@Component
@Slf4j
public class DoJoinPoint {

    @Resource
    private StarterService starterService;

    @Pointcut("@annotation(com.zhangxd.demo.design.annocation.DoDoor)")
    public void aopPoint(){}

    @Around("aopPoint()")
    public Object doRouter(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取内容
        Method method = getMethod(joinPoint);
        DoDoor door = method.getAnnotation(DoDoor.class);

        // 获取字段值
        String keyVal = getFeildVal(door.key(), joinPoint.getArgs());
        log.info("门面处理方法：{} value: {}", method.getName(), keyVal);
        if(null == keyVal || "".equals(keyVal)){
            return joinPoint.proceed();
        }
        // 配置内容
        String[] split = starterService.split(",");
        // 白名单过滤
        for (String str : split) {
            if (keyVal.equals(str)) {
                return joinPoint.proceed();
            }
        }
        //拦截
        return returnObject(door, method);
    }

    private Object returnObject(DoDoor door, Method method) throws Exception {
        Class<?> returnType = method.getReturnType();
        String returnJson = door.returnJson();
        if ("".equals(returnJson)) {
            return returnType.newInstance();
        }
        return JSON.parseObject(returnJson, returnType);
    }

    private String getFeildVal(String filed, Object[] args) {
        String filedValue = null;
        for (Object arg : args) {
            try {
                if (null == filedValue || "".equals(filedValue)) {
                    filedValue = BeanUtils.getProperty(arg, filed);
                } else {
                    break;
                }
            } catch (Exception e) {
                if (args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return filedValue;
    }

    private Method getMethod(JoinPoint jp) throws Throwable {
        Signature sig = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) sig;
        return jp.getTarget().getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
    }

}
