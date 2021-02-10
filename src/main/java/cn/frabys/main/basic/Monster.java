package cn.frabys.main.basic;

import cn.frabys.main.levels.MonsterLevel;

public abstract class Monster {

    private int id;

    private String name;

    private int entityId;

    private int bleed;

    private MonsterLevel level;

    public Monster(int id, String name, int entityId, int bleed, MonsterLevel level) {
        this.id = id;
        this.name = name;
        this.entityId = entityId;
        this.bleed = bleed;
        this.level = level;
    }
}
