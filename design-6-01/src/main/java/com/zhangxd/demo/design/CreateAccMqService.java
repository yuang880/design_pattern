package com.zhangxd.demo.design;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.mq.CreateAcc;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
public class CreateAccMqService {

    public static void onMessage(String message){
        CreateAcc createAcc = JSON.parseObject(message, CreateAcc.class);
        // 拿到消息后进行业务处理
    }

    public static void main(String[] args) {
        onMessage("{\"accountDate\":1678613367842,\"address\":\"beijing\",\"desc\":\"test\",\"number\":\"1\"}");
    }
}
