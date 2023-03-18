package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.ICacheAdapter;
import com.zhangxd.demo.design.card.matter.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        return iir.gain(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.delete(key);
    }

}
