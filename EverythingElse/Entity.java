package EverythingElse;

public class Entity {
    //node-related
    Entity next;

    //information
    //required
    int hp;
    int initiative;
    String name;
    //misc.
    String statusEffect;
    String actions;

    public Entity(int hp, int initiation, String name) {
        this.hp = hp;
        this.initiative = initiation;
        this.name = name;
        next = null;
    }

    public Entity(int initiation, String name) {
        this.initiative = initiation;
        this.name = name;
        next = null;
    }

    //print formatting
    public String toString() {
        return "Name: " + name +
                " HP: " + hp +
                " Initiation: " + initiative;
        }
}
