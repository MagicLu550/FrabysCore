package cn.frabys.main.basic;

public abstract class Entity {

    private double buff;

    private int level;

    private int heath;

    public Entity() {

    }

    public Entity(double buff,int level,int heath) {
        this.buff = buff;
        this.level = level;
        this.heath = heath;
    }

    public double getBuff() {
        return buff;
    }

    public void setBuff(double buff) {
        this.buff = buff;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public abstract void Attack(Entity entity);

    public void Player () {
    }
}