package com.zhangxd.demo.design.impl;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.NetMall;
import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Encoder;
import sun.net.www.http.HttpClient;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
@Slf4j
public class TaobaoNetMall extends NetMall {

    public TaobaoNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean login(String uId, String uPwd) {
        log.info("模拟淘宝用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("price", "4799.00");
        log.info("模拟淘宝商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        log.info("模拟生成淘宝商品base64海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
    }
}
