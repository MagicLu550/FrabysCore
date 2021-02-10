package cn.frabys.main.basic;

import cn.frabys.main.levels.LevelType;

public abstract class Level {

    private int level;

    private String name;

    private LevelType type;

    private double ex;

    private double nowEx;

    public Level(int level, String name, LevelType type, double ex) {
        this.level = level;
        this.name = name;
        this.type = type;
        this.ex = ex;
        this.nowEx = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelType getType() {
        return type;
    }

    public void setType(LevelType type) {
        this.type = type;
    }

    public double getEx() {
        return ex;
    }

    public void setEx(double ex) {
        this.ex = ex;
    }

    public double getNowEx() {
        return nowEx;
    }

    public void setNowEx(double nowEx) {
        this.nowEx = nowEx;
    }
}
