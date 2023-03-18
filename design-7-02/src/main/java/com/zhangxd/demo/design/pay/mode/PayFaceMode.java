package com.zhangxd.demo.design.pay.mode;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class PayFaceMode implements PayMode{

    public boolean security(String uId) {
        log.info("人脸支付，风控校验脸部识别");
        return true;
    }

}
