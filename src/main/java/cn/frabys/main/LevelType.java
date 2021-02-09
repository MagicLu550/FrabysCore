package cn.frabys.main;

public enum LevelType {
        BELL("铃铛",1),RED("赤笛",2),HEAVEN("苍笛",3),MOON("月笛",4),BLACK("黑笛",5),WHITE("白笛",6);
        //成员变量
    private String type;
    private int level;
    public LevelType(String type,int level) {
        this.type = type;
        this.level = level;
    }
    /**
     * 此枚举类用以获取Level和Type两个变量
     */
    public static String getType(int level) {
        for (LevelType c : LevelType.values()) {
            if (c.getLevel() == level) {
                return c.type;
            }
        }
        return null;
    }

    /**
     * 成员变量的geter和seter方法.
     * @return
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
