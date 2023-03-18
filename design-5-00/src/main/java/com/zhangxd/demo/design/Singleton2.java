package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class Singleton2 {

    /**
     * 构造方法私有化
     */
    private Singleton2(){}

    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance(){
        if(null == instance){
            return new Singleton2();
        }
        return instance;
    }

}
