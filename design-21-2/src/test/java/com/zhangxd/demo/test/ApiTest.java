package com.zhangxd.demo.test;

import com.zhangxd.demo.design.NetMall;
import com.zhangxd.demo.design.impl.TaobaoNetMall;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_NetMall() {
        NetMall netMall = new TaobaoNetMall("1000001", "*******");
        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        log.info("测试结果：{}", base64);
    }

}
