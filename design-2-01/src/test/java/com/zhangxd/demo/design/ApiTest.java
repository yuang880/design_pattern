package com.zhangxd.demo.design;

import com.zhangxd.demo.design.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user", "xxx", 0);
        String val01 = cacheService.get("user", 0);
        System.out.println("测试结果：" + val01);

    }

}
