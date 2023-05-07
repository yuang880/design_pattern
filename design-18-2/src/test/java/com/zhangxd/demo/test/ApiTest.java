package com.zhangxd.demo.test;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.LotteryResult;
import com.zhangxd.demo.design.LotteryService;
import com.zhangxd.demo.design.LotteryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        log.info("测试结果：{}", JSON.toJSONString(result));
    }
}
