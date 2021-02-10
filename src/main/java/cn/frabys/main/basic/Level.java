package cn.frabys.main.basic;

import cn.frabys.main.levels.LevelType;

public abstract class Level {

    int level;

    String name;

    LevelType type;

    double ex;

    double nowEx;

    public Level(int level, String name, LevelType type, double ex, double nowEx) {
        this.level = level;
        this.name = name;
        this.type = type;
        this.ex = ex;
        this.nowEx = nowEx;
    }
}
