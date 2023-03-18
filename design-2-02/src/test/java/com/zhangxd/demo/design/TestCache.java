package com.zhangxd.demo.design;


import com.zhangxd.demo.design.impl.EGMCacheAdapter;
import com.zhangxd.demo.design.impl.IIRCacheAdapter;
import com.zhangxd.demo.design.proxy.JDKProxyFac;
import org.junit.Test;

public class TestCache {

    @Test
    public void test02() throws Exception {

        ICacheService egm = JDKProxyFac.getProxy(new EGMCacheAdapter());
        egm.set("userName", "egm");
        String val01 = egm.get("userName");
        System.out.println("测试结果：" + val01);

        ICacheService iir = JDKProxyFac.getProxy(new IIRCacheAdapter());
        iir.set("userName", "iir");
        String val02 = iir.get("userName");
        System.out.println("测试结果：" + val02);

    }

}
