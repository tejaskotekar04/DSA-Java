class Node {
   int data; //data is an integer variable to store the data of the node
   Node next; //next is a reference variable of type Node, it points to the next node in the linked list
   static void printList(Node n){ //static method to print the linked list
    int count = 0;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
            count++;
        }
        System.out.println("No. of elements in the linked list: " +count);
    }

    static Node push(Node head, int newData){ //static method to insert a new node at the beginning
            Node newNode = new Node();    // 1. Create new node object
            newNode.data = newData;       // 2. Set the data value
            newNode.next = head;          // 3. Link to existing list
            head = newNode;               // 4. Update head reference
            return head;                  // 5. Return new head
}

    public static void main(String[] args) { //main method should be static in class Node
        Node head = null; //initially head is null
        head = push(head,5); // List becomes: 5 → null, returns new head
        head = push(head,10); // List becomes: 10 → 5 → null, returns new head

        printList(head); // Prints: 10, then 5, then count
         //calling the static method to print the linked list
    }
}

/* 
 What the code does:
1. Creates a simple Node class with data (integer) and next (reference to next node)
2. Implements a push method that adds new nodes at the beginning of the list
3. Implements a printList method that traverses and prints all elements while counting them
4. In main, creates a list with values 10 → 5 and prints it

 */

