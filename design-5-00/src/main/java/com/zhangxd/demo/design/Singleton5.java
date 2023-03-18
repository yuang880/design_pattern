package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton5 {

    /**
     * 构造方法私有化
     */
    private Singleton5(){}

    private static Singleton5 instance = new Singleton5();

    public synchronized static Singleton5 getInstance(){
        return instance;
    }
}
