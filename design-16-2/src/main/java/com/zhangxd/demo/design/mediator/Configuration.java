package com.zhangxd.demo.design.mediator;

import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@NoArgsConstructor
@Setter
public class Configuration {

    public Connection connection;
    public Map<String, String> dataSource;
    public Map<String, XNode> mapperElement;

}
