package com.zhangxd.demo.design;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.card.IQiYiCardService;
import com.zhangxd.demo.design.coupon.CouponResult;
import com.zhangxd.demo.design.coupon.CouponService;
import com.zhangxd.demo.design.goods.DeliverReq;
import com.zhangxd.demo.design.goods.GoodsService;
import lombok.extern.slf4j.Slf4j;

/**
 * 模拟发奖服务
 *
 * @author zhangxd
 * @version 1.0 2023/2/20
 */
@Slf4j
public class PrizeController {

    public AwardResp awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardResp resp = null;
        try {
            log.info("奖品发放开始{}。req:{}", req.getUId(), reqJson);
            // 使用if来判断奖品类型，再执行对应的发送奖品服务。[1优惠券 2实物 3第三方卡]
            if (1 == req.getAwardType()) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getUId(), req.getAwardNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    resp = new AwardResp("0000", "发放成功");
                } else {
                    resp = new AwardResp("0001", couponResult.getInfo());
                }
            } else if (2 == req.getAwardType()) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = buildDeliverReq(req);
                boolean successFlag = goodsService.delieverGoods(deliverReq);
                if (successFlag) {
                    resp = new AwardResp("0000", "发放成功");
                } else {
                    resp = new AwardResp("0001", "发放失败");
                }
            } else if (3 == req.getAwardType()) {
                String bindMobileNumber = queryUserPhoneNumber(req.getUId());
                IQiYiCardService cardService = new IQiYiCardService();
                cardService.grantToken(bindMobileNumber, req.getAwardNumber());
                resp = new AwardResp("0000", "发放成功");
            }
            log.info("奖品发放完成{}。", req.getUId());
        } catch (Exception e) {
            log.error("奖品发送失败{}。req:{}", req.getUId(), reqJson, e);
            resp = new AwardResp("0001", e.getMessage());
        }
        return resp;
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

    private DeliverReq buildDeliverReq(AwardReq req) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName("user");
        deliverReq.setUserPhone(queryUserPhoneNumber(req.getUId()));
        deliverReq.setSku(req.getAwardNumber());
        deliverReq.setOrderId(req.getBizId());
        deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
        return deliverReq;
    }
}
