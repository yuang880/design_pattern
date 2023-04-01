package com.zhangxd.demo.design;

import lombok.*;

/**
 * @author zhangxd
 * @version 1.0 2023/3/22
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Stock {

    /**
     * 总量
     */
    private int total;

    /**
     * 卖出量
     */
    private int used;
}
