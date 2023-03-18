package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton1 {

    /**
     * 构造方法私有化
     */
    private Singleton1(){}

    private static Singleton1 instance;

    public static Singleton1 getInstance(){
        if(null == instance){
            return new Singleton1();
        }
        return instance;
    }

}
