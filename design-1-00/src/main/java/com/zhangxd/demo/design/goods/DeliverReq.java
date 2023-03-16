package com.zhangxd.demo.design.goods;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author zhangxd
 * @version 1.0 2023/2/19
 */
@Getter
@Setter
@Accessors(chain = true)
public class DeliverReq {

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机
     */
    private String userPhone;

    /**
     * 商品SKU  Stock Keeping Unit  库存控制的最小单位  件  盒..
     */
    private String sku;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 收货人姓名
     */
    private String consigneeUserName;

    /**
     * 收货人手机
     */
    private String consigneeUserPhone;

    /**
     * 收货人地址
     */
    private String consigneeUserAddress;

}
