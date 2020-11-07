package EverythingElse;

public class CombatManager{
    //this is me changing something 
    public static void main(String[] args) {
        LLEntity list = new LLEntity();
        Entity person = MakeEntity(5, "YETI");
        Entity person2 = MakeEntity(10, "Homer");
        Entity person3 = MakeEntity(1, "Willan");
        Entity person4 = MakeEntity(1, "Kierra");
        Entity monster = MakeEntity(34, 23, "MONSTER");
        list.insert(list, person);
        list.insert(list, person2);
        list.insert(list, person3);
        list.insert(list, person4);
        list.insert(list, monster);

        list.head = list.MergeSort(list.head); 
        //Name        Initative       HP       Conditions

        
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

//Ideas to implement eventually : ) 
// - multiple turn save backs 
// - pass in file for creating Entities
// - add conditions
// - while loop which plays until the combat ends 
//   > can perfrom methods in the terminal with a UI 
// - ability to Undo an Action
// - log of what happened with .log()  or something like that