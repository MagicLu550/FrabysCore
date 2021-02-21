package cn.frabys.main.basic;

import cn.frabys.main.levels.MonsterLevel;

public abstract class Monster extends Entity {

    private int id;

    private String name;

    private int entityId;

    private int bleed;

    private MonsterLevel level;

    @Override
    public void Attack(Entity entity) {

    }

    public Monster(int id, String name, int entityId, int bleed, MonsterLevel level) {
        this.id = id;
        this.name = name;
        this.entityId = entityId;
        this.bleed = bleed;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public int getBleed() {
        return bleed;
    }

    public void setBleed(int bleed) {
        this.bleed = bleed;
    }

    public MonsterLevel getLevel() {
        return level;
    }

    public void setLevel(MonsterLevel level) {
        this.level = level;
    }
}

class MonstersSkill extends Skill {

}