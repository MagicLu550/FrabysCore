package cn.frabys.main;


import cn.frabys.main.basic.Level;
import cn.frabys.main.levels.LevelType;
import cn.frabys.main.levels.PlayerLevel;

public class Frabys {
    public static void main(String[] args) {
        Level test = new PlayerLevel(0,"test", LevelType.WHITE,10);
        System.out.println("角色名:" + test.getName());
        System.out.println("当前段位:" + test.getType());
        System.out.println("当前经验:" + test.getNowEx());
        System.out.println("距离升级还差:" + test.howEx());
        System.out.println("当前等级:" + test.getLevel());
        double getEx = 159;
        System.out.println("获得经验:" + getEx);
        test.addEx(getEx);
        System.out.println("当前等级:" + test.getLevel());
        System.out.println("当前经验:" + test.getNowEx());
    }
}
