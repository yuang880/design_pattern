package com.zhangxd.demo.design.cuisine.impl;

import com.zhangxd.demo.design.cook.Cook;
import com.zhangxd.demo.design.cuisine.Cuisine;

/**
 * @author zhangxd
 * @version 1.0 2023/4/9
 */
public class JiangSuCuisine implements Cuisine {

    private Cook cook;

    public JiangSuCuisine(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
