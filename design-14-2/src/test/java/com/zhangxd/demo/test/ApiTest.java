package com.zhangxd.demo.test;

import com.zhangxd.demo.design.XiaoEr;
import com.zhangxd.demo.design.cook.impl.GuangDongCook;
import com.zhangxd.demo.design.cook.impl.JiangSuCook;
import com.zhangxd.demo.design.cuisine.Cuisine;
import com.zhangxd.demo.design.cuisine.impl.GuangDongCuisine;
import com.zhangxd.demo.design.cuisine.impl.JiangSuCuisine;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test(){

        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        Cuisine guangDoneCuisine = new GuangDongCuisine(new GuangDongCook());
        Cuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);

        // 下单
        xiaoEr.placeOrder();
    }

}
