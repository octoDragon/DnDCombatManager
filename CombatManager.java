import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CombatManager {

    public static void main(String[] args) {

        //Setting up Data
        LLEntity list = new LLEntity();
        File myFile = new File("input.txt");
        CombatManager.ReadInFile(myFile, list);

        //Running the Encounter
        boolean playGame = true;
        String action = new String();
        Scanner userInput = new Scanner(System.in);

        while (playGame) {
            //TODO: PrintMenu, SwitchStatement (add, subtract, kill), saves???
            System.out.print("Action : ");
            action = userInput.nextLine();
            //printMenu()
            //switch statement of what you want to do, manually type the char.
            switch (action) {
                case "condition":
                    System.out.println("bird");
                    break;
                case "subtract":
                    System.out.println("cow");
                    break;
                case "add": {
                    System.out.println("snake");
                    playGame = false;
                    break;
                }
                case "kill":
                    //remove from the table
                    break;
                case "end": {
                    System.out.println("Are you sure you want to stop combat? Y or N?");
                    action = userInput.nextLine();
                    if (action.equals("Y")) playGame = false;
                }
            }

            if (!action.equals("Y")) list.printList(list);
            else {
                System.out.println("Thanks for playing :)");
            }
            //if user input = escape, exit
        }
    }


    //Methods
//    private static LLEntity PrintMenu() {
//
//    }

    private static LLEntity ReadInFile(File myFile, LLEntity list) {
        Scanner fileReader;
        try {
            fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                String[] dataArray = data.split(" ");
                if (!dataArray[0].equals("c")) //avoid comment errors in text file
                {
                    int c = 0;
                    Entity entity = new Entity();
                    for (String s : dataArray) {
                        if (c == 0) entity.name = s;
                        if (c == 1) entity.initiative = Integer.parseInt(s);
                        if (c == 2) {
                            if (s.equals("X")) {
                                entity.hp -= -1;
                            } //converted into X in print script //TODO implement this
                            else {
                                entity.hp = Integer.parseInt(s);
                            }
                        }
                        if (c == 3) {
                            if (s.equals("X")) {
                                entity.condition = "(none)";
                            } else {
                                entity.condition = s;
                            }
                        }
                        c++;
                    }
                    list.insert(list, entity);
                }
            }
        } catch (
                FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        list.head = list.MergeSort(list.head); //sorts the list
        return list;
    }
}


//Ideas to implement eventually : )
// - multiple turn save backs
// - pass in file for creating Entities WORKING ON NOW
// - add conditions
// need a console memory
//   > can perfrom methods in the terminal with a UI
// - ability to Undo an Action
// - log of what happened with .log()  or something like that
// - have a linked list of all the rounds the combat > have the .head structure, treat them as nodes?
