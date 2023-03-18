package com.zhangxd.demo.design.service.logic.impl;

import com.zhangxd.demo.design.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
public class UserAgeFilter extends BaseLogic {


    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
