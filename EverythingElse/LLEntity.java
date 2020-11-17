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
         System.out.println("-----------------------------------------------");
         System.out.printf("%s %15s %7s %16s%n \n", "Name", "Initiative", "HP", "Conditions");
         while (last.next != null) { //walks the SLL and prints each Entity

            System.out.println(last);
             last = last.next;
         }
         System.out.println(last); //prints last link
         System.out.println("-----------------------------------------------");
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
     public void DetermineInitiative(LLEntity list)
     {
         //using MergeSort()
         //how to sort a link list, then run format
         //printlist(list);
     }


     //template used from Geeks for Geeks Merge Sort LL website
     private Entity sortedMerge(Entity a, Entity b)
     {
        Entity result = null;
        //Base cases > when no recursion takes place
        if (a == null){return b;}
        if (b == null){return a;}

        //Pick either a or b, and recur 
        if (a.initiative <= b.initiative) {
            result = a;
            result.next = sortedMerge(a.next,b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;

     }

     public Entity MergeSort(Entity h)
     {
        // Base case : if head is null 
        if ( h == null || h.next == null) { 
            return h; 
        } 
  
        // get the middle of the list 
        Entity middle = getMiddle(h); 
        Entity nextofmiddle = middle.next; 
  
        // set the next of middle node to null 
        middle.next = null; 
  
        // Apply mergeSort on left list 
        Entity left = MergeSort(h); 
  
        // Apply mergeSort on right list 
        Entity right = MergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        Entity sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    // Utility function to get the middle of the linked list 
    public static Entity getMiddle(Entity head) 
    { 
        if (head == null)
            return head; 
  
        Entity slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; //advance by one 
            fast = fast.next.next; //advance by two
        } 
        return slow; 
    } 
}