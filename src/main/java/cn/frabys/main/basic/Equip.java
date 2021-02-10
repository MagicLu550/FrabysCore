package cn.frabys.main.basic;

import cn.frabys.main.levels.EquipLevel;

public abstract class Equip {

    int durable;

    int id;

    String name;

    EquipLevel level;

    public Equip(int durable, int id, String name, EquipLevel level) {
        this.durable = durable;
        this.id = id;
        this.name = name;
        this.level = level;
    }
}
