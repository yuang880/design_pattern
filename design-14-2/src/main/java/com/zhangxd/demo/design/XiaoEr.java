package com.zhangxd.demo.design;

import com.zhangxd.demo.design.cuisine.Cuisine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxd
 * @version 1.0 2023/4/9
 */
public class XiaoEr {

    private List<Cuisine> cuisineList = new ArrayList<>();

    public void order(Cuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (Cuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
