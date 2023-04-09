package com.zhangxd.demo.design.cook.impl;

import com.zhangxd.demo.design.cook.Cook;

/**
 * @author zhangxd
 * @version 1.0 2023/4/9
 */
public class GuangDongCook implements Cook {

    @Override
    public void doCooking() {
        System.out.println("广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
