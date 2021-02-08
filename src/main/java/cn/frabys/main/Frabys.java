package cn.frabys.main;


import java.util.HashMap;
import java.util.logging.Level;

public class Frabys {
    private final PlayerListener playerListener = new PlayerListener();
    private final BlockListener blockListener = new BlockListener();
    private final HashMap<String, Level> hmp = new HashMap<String, Level>();



    public static void main(String[] args) {
    }
}
