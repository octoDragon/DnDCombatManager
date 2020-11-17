package EverythingElse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CombatManager {
    // this is me changing something
    public static void main(String[] args) {
        LLEntity list = new LLEntity();
        File myFile = new File("EverythingElse/input.txt");
        Scanner fileReader;
        try {
            fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                int c = 0; //count 
                String data = fileReader.nextLine();
                String[] dataArray = data.split(" ");
                // for (int i = 0; i < dataArray.length; i++)
                // {
                //     System.out.println(dataArray[i]);
                // }
                if (!dataArray[0].equals("c")) //avoid comment errors in text file
                { 
                Entity entity = new Entity();
                    for (String s : dataArray)
                    { 
                        if (c == 0) entity.name = s;
                        if (c == 1) entity.initiative = Integer.parseInt(s);
                        if (c == 2) {
                            if (s.equals("X")){entity.hp = -1;} //converted into X in print script //TODO implement this
                            else{entity.hp = Integer.parseInt(s);}
                        }
                        c ++;
                        list.insert(list, entity);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }

        list.printList(list);
        
        // Entity person = MakeEntity(5, "YETI");
        // Entity person2 = MakeEntity(10, "Homer");
        // Entity person3 = MakeEntity(1, "Willan");
        // Entity person4 = MakeEntity(1, "Kierra");
        // Entity monster = MakeEntity(34, 23, "MONSTER");
        // list.insert(list, person);
        // list.insert(list, person2);
        // list.insert(list, person3);
        // list.insert(list, person4);
        // list.insert(list, monster);

        // list.head = list.MergeSort(list.head); 
        //Name        Initative       HP       Conditions
        //list.printList(list); 
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
// - pass in file for creating Entities WORKING ON NOW
// - add conditions
// - while loop which plays until the combat ends 
//   > can perfrom methods in the terminal with a UI 
// - ability to Undo an Action
// - log of what happened with .log()  or something like that