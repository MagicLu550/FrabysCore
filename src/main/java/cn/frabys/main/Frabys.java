package cn.frabys.main;


import cn.frabys.main.basic.Level;
import cn.frabys.main.levels.LevelType;
import cn.frabys.main.levels.PlayerLevel;

public class Frabys {
    public static void main(String[] args) {
        Level test = new PlayerLevel(0,"test", LevelType.WHITE,10);
        System.out.println(test.getLevel());
    }
}
