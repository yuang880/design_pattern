package com.zhangxd.demo.test;

import com.zhangxd.demo.design.StoreFactory;
import com.zhangxd.demo.design.store.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/20
 */
@Slf4j
public class ApiTest {
    @Test
    public void testAwardToUser() throws Exception {

        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        Commodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        Commodity commodityService_2 = storeFactory.getCommodityService(2);

        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        Commodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);
    }


}
