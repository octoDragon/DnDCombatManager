package EverythingElse;

public class LLEntity {
     //LL parameter
     Entity head = null;
     Entity currentNode = null;
 
     public LLEntity insert(LLEntity list, Entity newNode) {
         //when LL is empty
         if (head == null) {
             head = newNode;
         }
 
         else {
             Entity last = list.head; //'walks' the list, current node position
             while (last.next != null) {
                 last = last.next;
             }
             //insert new node
             last.next = newNode;
         }
 
         return list;
     }
 
     public void printList(LLEntity list) {
         Entity last = list.head;
         while (last.next != null) { //walks the SLL and prints each Entity
            System.out.println(last);
             last = last.next;
         }
         System.out.println(last); //prints last link
         System.out.println("----------------------------");
     }
 
     public void SubtractHP(LLEntity list, String name, int amount) {
         Entity last = list.head;
         while (last.name != name) {
             if (last.next == null) {
                System.out.println("Invalid Name");
                 break;
             }
             last = last.next;
         }
         //subtraction
         last.hp -= amount;
         printList(list);
     }
 
     //rearange linked list to match initiative
}