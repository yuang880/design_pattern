package com.zhangxd.demo.test;

import com.zhangxd.demo.design.QuestionController;
import org.junit.Test;

/**
 * @author zhangxd
 * @version 1.0 2023/3/1
 */
public class ApiTest {


    @Test
    public void test01(){
        QuestionController questionBankController = new QuestionController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}
