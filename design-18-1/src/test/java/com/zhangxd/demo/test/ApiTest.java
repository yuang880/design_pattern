package com.zhangxd.demo.test;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.LotteryResult;
import com.zhangxd.demo.design.LotteryService;
import com.zhangxd.demo.design.LotteryServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        System.out.println("测试结果：" + JSON.toJSONString(result));
    }

}
