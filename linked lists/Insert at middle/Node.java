//Add a node after a given node in a singly linked list
class Node {
    int data;
    Node next;

    static void printList(Node n){
        int count = 0;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
            count++;
        }
        System.out.println("No. of elements in the linked list: " +count);
    }

    static Node push(Node head, int newData){
        Node newNode = new Node(); //Create a new node
        newNode.data = newData; //Assign data to the new node -: newData
        newNode.next = head; //Make next of new node as head
        head = newNode; //Move the head to point to the new node
        return head; //Return the new head
    }

    static void insertAfter(Node prev_node, int newData){
         Node newNode = new Node(); //Create a new node 
         newNode.data = newData; //Assign data to the new node -: newData
         newNode.next = prev_node.next; //Make the next of new node as next of previous node
         //For example, if previous node is B and next node is C, then new node will be inserted between them
         //So, new node will point towards C
         prev_node.next = newNode; // B will point towards new node
         //The next of a previous node will point towards the new node
    }
    public static void main(String[] args) {
        Node head = null;

        // Update head with returned value
        head=push(head, 5); 
        head=push(head, 7);
        head=push(head, -3);
        
        // List becomes: -3 → 7 → 5 → null, returns new head

        insertAfter(head.next, 79); //Inserting 79 in next of the head node
        //For example, if head node is -3 and next node is 7, then 79 will be inserted after 7
        //Insert 79 after the node that "head.next" points to. 
        //Since head.next points to the node with value 7, we're inserting 79 after the node with value 7.

        printList(head); // Prints: -3, then 7, then 79, then 5, then count.
         //calling the static method to print the linked list
    }
}

/*
      head → [-3|•] → [7|•] → [79|•] → [5|null]
              ^        ^       ^        ^
             head   head.next inserted  tail
 */
