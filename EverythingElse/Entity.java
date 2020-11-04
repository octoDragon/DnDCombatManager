package EverythingElse;

public class Entity {
    //node-related
    Entity next;

    //information
    //required
    int hp;
    int initiation;
    String name;
    //misc.
    String statusEffect;
    String actions;

    public Entity(int hp, int initiation, String name) {
        this.hp = hp;
        this.initiation = initiation;
        this.name = name;
        next = null;
    }

    //print formatting
    public String toString() {
        return "Name: " + name +
                " HP: " + hp
                + " Initiation: " + initiation;
    }
}
