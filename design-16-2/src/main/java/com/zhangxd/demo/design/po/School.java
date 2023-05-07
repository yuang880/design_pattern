package com.zhangxd.demo.design.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class School {

    private Long id;
    private String name;
    private String address;
    private Date createTime;
    private Date updateTime;

}
