package com.zhangxd.demo.design.po;

import lombok.*;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String name;
    private Integer age;
    private String address;
}
