package com.zhangxd.demo.design;


import com.zhangxd.demo.design.celling.LevelOneCeiling;
import com.zhangxd.demo.design.celling.LevelTwoCeiling;
import com.zhangxd.demo.design.coat.DuluxCoat;
import com.zhangxd.demo.design.coat.LiBangCoat;
import com.zhangxd.demo.design.floor.ShengXiangFloor;
import com.zhangxd.demo.design.tile.DongPengTile;
import com.zhangxd.demo.design.tile.MarcoPoloTile;

public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
    }

}
