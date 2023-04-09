package com.zhangxd.demo.design.agent;

import java.lang.annotation.*;

/**
 * @author zhangxd
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";

}
