package com.zhangxd.demo.design;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhangxd
 * @version 1.0 2023/2/20
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AwardResp {

    /**
     * 编码
     */
    private String code;

    /**'
     * 描述
     */
    private String info;

}
