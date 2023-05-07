package com.zhangxd.demo.design;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@Getter
@Setter
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigMemento saveMemento(){
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento){
        this.configFile = memento.getConfigFile();
    }

}
