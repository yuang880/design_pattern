package com.zhangxd.demo.design;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 配置文件备忘录
 *
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigMemento {
    private ConfigFile configFile;
}
