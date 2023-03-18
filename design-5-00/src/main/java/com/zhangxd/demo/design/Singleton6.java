package com.zhangxd.demo.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS  比较并交换  轮询判断
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton6 {

    /**
     * 构造方法私有化
     */
    private Singleton6(){}

    private static final AtomicReference<Singleton6> INSTANCE = new AtomicReference<>();

    private static Singleton6 instance = new Singleton6();

    public static Singleton6 getInstance(){
        for (; ; ) {
            Singleton6 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton6());
            return INSTANCE.get();
        }
    }
}
