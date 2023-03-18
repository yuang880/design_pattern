package com.zhangxd.demo.design.service.engine;

import com.zhangxd.demo.design.service.logic.LogicFilter;
import com.zhangxd.demo.design.service.logic.impl.UserAgeFilter;
import com.zhangxd.demo.design.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

}
