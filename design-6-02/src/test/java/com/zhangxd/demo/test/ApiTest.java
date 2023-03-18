package com.zhangxd.demo.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.MqAdapter;
import com.zhangxd.demo.design.OrderAdapterService;
import com.zhangxd.demo.design.RebateInfo;
import com.zhangxd.demo.design.impl.InsideOrderService;
import com.zhangxd.demo.design.impl.PopOrderAdapterServiceImpl;
import com.zhangxd.demo.design.mq.CreateAcc;
import com.zhangxd.demo.design.mq.OrderMq;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@Slf4j
public class ApiTest {

    @Test
    public void testMqAdapter() throws Exception {

        DateTime parse = DateUtil.date();
        String format = DateUtil.format(parse, "yyyy-MM-dd");

        CreateAcc create_account = new CreateAcc();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(format);
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MqAdapter.filter(create_account.toString(), link01);
        System.out.println("mq.create_account(适配前)" + create_account);
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MqAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq);
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new PopOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }

}
