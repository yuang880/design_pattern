package com.zhangxd.demo.test;

import com.zhangxd.demo.design.XiaoEr;
import org.junit.Test;

/**
 * @author zhangxd
 * @version 1.0 2023/4/9
 */
public class ApiTest {

    @Test
    public void test(){
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(1);
        xiaoEr.order(2);
        xiaoEr.order(3);
//        xiaoEr.order(4);

        // 下单
        xiaoEr.placeOrder();
    }

}
