package cn.frabys.main;


import cn.frabys.main.basic.Level;
import cn.frabys.main.levels.LevelType;

public class Frabys {
    public static void main(String[] args) {
        Level test = new Level(0,"test","BLACK",10) {
            @Override
            public void addEx(double ex0) {
                super.addEx(ex0);
            }
        };
        test.addEx(10);
        System.out.println(test.getLevel());
    }
}
