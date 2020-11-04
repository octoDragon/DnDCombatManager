package EverythingElse;

public class CombatManager{
    public static void main(String[] args) {
        LLEntity list = new LLEntity();
        Entity person = MakeEntity(90, 5, "Juniper");
        Entity person2 = MakeEntity(90, 10, "Magni");
        Entity person3 = MakeEntity(90, 1, "Yellow");
        list.insert(list, person);
        list.insert(list, person2);
        list.insert(list, person3);
        list.printList(list);

        list.SubtractHP(list, "Magni", 20);
        //Q: how do I access a specific node
    }

    private static Entity MakeEntity(int hp, int initiation, String name) {
        Entity person = new Entity(hp, initiation, name);
        return person;
    }
}