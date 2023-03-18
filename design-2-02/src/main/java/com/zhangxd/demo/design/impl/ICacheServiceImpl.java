package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.ICacheService;
import com.zhangxd.demo.design.card.matter.RedisUtils;

import java.util.concurrent.TimeUnit;

public class ICacheServiceImpl implements ICacheService {

    private RedisUtils redisUtils = new RedisUtils();


    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
