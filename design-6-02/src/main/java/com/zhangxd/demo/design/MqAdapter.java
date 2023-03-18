package com.zhangxd.demo.design;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
public class MqAdapter {

    public static RebateInfo filter(String strJson, Map<String, String> link) throws Exception {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo info = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            String str = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
            RebateInfo.class.getMethod(str, String.class).invoke(info, val.toString());
        }
        return info;
    }
}
