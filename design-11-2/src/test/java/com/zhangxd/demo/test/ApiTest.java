package com.zhangxd.demo.test;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.Activity;
import com.zhangxd.demo.design.ActivityController;
import org.junit.Test;

public class ApiTest {

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            String format = "测试结果：" + req + "," + JSON.toJSONString(activity);
            System.out.println(format);
//            Thread.sleep(1200);
        }
    }

}
