package com.zhangxd.demo.design;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangxd
 * @version 1.0 2023/2/25
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
