package com.zhangxd.demo.design.mediator;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
