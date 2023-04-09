package com.zhangxd.demo.design.cook.impl;

import com.zhangxd.demo.design.cook.Cook;

/**
 * @author zhangxd
 * @version 1.0 2023/4/9
 */
public class JiangSuCook implements Cook {

    @Override
    public void doCooking() {
        System.out.println("江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
    }
}
