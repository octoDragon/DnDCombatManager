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
    String condition;
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
    // System.out.printf("%s %15s %8s %16s%n \n", "Name", "Initiative", "HP", "Conditions");
    public String toString() {

        if (hp > 0)
        {
            return String.format("%-9.7s %-15s %-8s %-16s", name, initiative, hp, condition);
            // return name + " HP: " + hp +
            //        " Initiation: " + initiative;
        }

        else 
        {
            return String.format("%-9s %-15s %-8s %-16s", name, initiative, "X", condition);
        }
    }
}
