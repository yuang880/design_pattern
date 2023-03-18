package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton4 {

    /**
     * 构造方法私有化
     */
    private Singleton4(){}

    private static Singleton4 instance = new Singleton4();

    public static Singleton4 getInstance(){
        return instance;
    }
}
