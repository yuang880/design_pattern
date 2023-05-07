package com.zhangxd.demo.test;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.mediator.Resources;
import com.zhangxd.demo.design.mediator.SqlSession;
import com.zhangxd.demo.design.mediator.SqlSessionFactory;
import com.zhangxd.demo.design.mediator.SqlSessionFactoryBuilder;
import com.zhangxd.demo.design.po.User;
import org.junit.Test;

import java.io.Reader;

public class ApiTest {

    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("com.zhangxd.demo.design.mapper.UserMapper.queryUserInfoById", 1L);
                System.out.println("测试结果：" + JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
