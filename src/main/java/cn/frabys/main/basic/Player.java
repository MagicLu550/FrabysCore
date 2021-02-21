package cn.frabys.main.basic;

public final class Player extends Entity {

    private int id;

    private String name;

    @Override
    public void Attack(Entity entity) {

    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
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
}

class PlayerSkill extends Skill {

}