package com.zhangxd.demo.design;

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
@Getter
@Setter
public class ConfigFile {

    private String versionNo;
    private String content;
    private Date dateTime;
    private String operator;
}
