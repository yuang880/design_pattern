package com.zhangxd.demo.design.card;

/**
 * @author zhangxd
 * @version 1.0 2023/2/19
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "," + cardId);
    }
}
