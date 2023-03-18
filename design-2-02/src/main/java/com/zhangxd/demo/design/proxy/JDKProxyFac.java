package com.zhangxd.demo.design.proxy;


import com.zhangxd.demo.design.ICacheAdapter;
import com.zhangxd.demo.design.ICacheService;
import com.zhangxd.demo.design.util.ClassLoaderUtil;

import java.lang.reflect.Proxy;

/**
 * @author zhangxd
 * @version 1.0 2023/2/25
 */
public class JDKProxyFac {

    // 在代理模式中，被代理的对象需要实现代理的接口。
    // 这里被代理的是一个接口。也没有继承代理接口。
    // ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtil.getClazzByArgs(args))是怎么实现的
    public static ICacheService getProxy(ICacheAdapter cacheAdapter) throws Exception{
        return (ICacheService) Proxy.newProxyInstance(JDKProxyFac.class.getClassLoader(), new Class[]{ICacheService.class},
                (proxy, method, args) -> ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtil.getClazzByArgs(args)).invoke(cacheAdapter, args));
//                (proxy, method, args) -> method.invoke(cacheAdapter, args));
    }

}
