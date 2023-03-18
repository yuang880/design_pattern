package com.zhangxd.demo.design.card.matter;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 模拟单机
 * @author zhangxd
 * @version 1.0 2023/2/23
 */
@Slf4j
public class RedisUtils {

    private Map<String,String> dataMap = new ConcurrentHashMap<>();

    public String get(String key){
        log.info("Redis 获取数据 key: {}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value){
        log.info("Redis 写入数据 key: {} val: {}", key, value);
        dataMap.put(key, value);
    }


    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("Redis写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("Redis删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
