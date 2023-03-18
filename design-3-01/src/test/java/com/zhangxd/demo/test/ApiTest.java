package com.zhangxd.demo.test;

import com.zhangxd.demo.design.DecorationPackageController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author zhangxd
 * @version 1.0 2023/2/25
 */
public class ApiTest {

    @Test
    public void test(){
        DecorationPackageController controller = new DecorationPackageController();
        System.out.println(controller.getMatterList(new BigDecimal("139.26"), 1));
    }

}
