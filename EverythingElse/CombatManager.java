package EverythingElse;

public class CombatManager{
    public static void main(String[] args) {
        LLEntity list = new LLEntity();
        Entity person = MakeEntity(5, "YETI");
        Entity person2 = MakeEntity(10, "Homer");
        Entity person3 = MakeEntity(1, "Willan");
        Entity person4 = MakeEntity(1, "Kierra");
        list.insert(list, person);
        list.insert(list, person2);
        list.insert(list, person3);
        list.insert(list, person4);
        list.printList(list);

        list.head = list.MergeSort(list.head); 
        System.out.print("\n Sorted Linked List is: \n"); 
        list.printList(list); 
    }

    private static Entity MakeEntity(int hp, int initiation, String name) {
        Entity person = new Entity(hp, initiation, name);
        return person;
    }

    private static Entity MakeEntity(int initiation, String name) {
        Entity person = new Entity(initiation, name);
        return person;
    }
}