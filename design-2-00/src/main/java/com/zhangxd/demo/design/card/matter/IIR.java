package com.zhangxd.demo.design.card.matter;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 模拟集群A
 * @author zhangxd
 * @version 1.0 2023/2/23
 */
@Slf4j
public class IIR {

    private Map<String,String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        log.info("IIR获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("IIR写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("IIR写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void delete(String key) {
        log.info("IIR删除数据 key：{}", key);
        dataMap.remove(key);
    }

}
