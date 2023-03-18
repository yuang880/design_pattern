package com.zhangxd.demo.design;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/20
 */
@Setter
@Getter
public class AwardReq {

    /**
     * 用户唯一id
     */
    private String uId;

    /**
     * 奖品类型；1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
     */
    private Integer awardType;

    /**
     * 奖品编号：sku、couponNumber、cardId
     */
    private String awardNumber;

    /**
     * 业务id，防重
     */
    private String bizId;

    /**
     * 扩展信息
     */
    private Map<String, String> extMap;
}
