package com.zhangxd.demo.design;

import lombok.*;

import java.util.Date;

/**
 * 摇号结果
 *
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LotteryResult {

    private String uId;
    private String msg;
    private Date dateTime;

}
