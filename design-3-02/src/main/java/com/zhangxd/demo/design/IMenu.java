package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/2/25
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter);
    IMenu appendCoat(Matter matter);
    IMenu appendFloor(Matter matter);
    IMenu appendTile(Matter matter);

    String getDetail();
}
