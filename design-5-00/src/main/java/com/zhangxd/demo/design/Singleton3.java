package com.zhangxd.demo.design;

import cn.hutool.core.lang.Singleton;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton3 {

    /**
     * 构造方法私有化
     */
    private Singleton3(){}

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance(){
        if(null != instance){
            return instance;
        }
        synchronized (Singleton3.class){
            if(null == instance){
                instance = new Singleton3();
            }
        }
        return instance;
    }
}
