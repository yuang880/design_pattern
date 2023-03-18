package com.zhangxd.demo.design.store;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/22
 */
public interface Commodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
