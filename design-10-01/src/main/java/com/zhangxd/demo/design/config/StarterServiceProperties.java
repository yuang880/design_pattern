package com.zhangxd.demo.design.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangxd
 * @version 1.0 2023/3/19
 */
@ConfigurationProperties("zhang.door")
@Getter
@Setter
public class StarterServiceProperties {
    private String userStr;
}
