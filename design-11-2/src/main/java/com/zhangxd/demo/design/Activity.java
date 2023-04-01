package com.zhangxd.demo.design;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/3/22
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Activity {

    private Long id;
    private String name;
    private String desc;
    private Date startTime;
    private Date stopTime;
    private Stock stock;

}
