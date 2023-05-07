package com.zhangxd.demo.design.mediator;

import java.util.List;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();

}
