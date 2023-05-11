package com.zhangxd.demo.test;

import com.zhangxd.demo.design.DataView;
import com.zhangxd.demo.design.visitor.impl.Parent;
import com.zhangxd.demo.design.visitor.impl.Principal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {


    @Test
    public void test() {
        DataView dataView = new DataView();

        log.info("\r\n家长视角访问：");
        dataView.show(new Parent());

        log.info("\r\n校长视角访问：");
        dataView.show(new Principal());
    }

}
