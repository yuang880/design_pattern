package com.zhangxd.demo.design;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
@Slf4j
public abstract class NetMall {

    String uId;

    String uPwd;

    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    /**
     * 生成商品推广海报
     *
     * @param skuUrl 商品地址(京东、淘宝、当当)
     * @return 海报图片base64位信息
     */
    public String generateGoodsPoster(String skuUrl) {
        // 1. 验证登录
        if (!login(uId, uPwd)) {
            return null;
        }
        // 2. 爬虫商品
        Map<String, String> reptile = reptile(skuUrl);
        // 3. 组装海报
        return createBase64(reptile);
    }


    protected abstract Boolean login(String uId, String uPwd);


    protected abstract Map<String, String> reptile(String skuUrl);


    protected abstract String createBase64(Map<String, String> goodsInfo);
}
