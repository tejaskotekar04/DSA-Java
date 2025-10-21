class Node {
    int data;
    Node next;
    Node prev; // For doubly linked list

    //Print the doubly linked list
      static void printList(Node n){
        int count = 0;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
            count++;
        }
        System.out.println("No. of elements in the doubly linked list: " +count);
    }

     //Insert node at the beginning of a doubly linked list
    static Node push(Node head, int new_data){
        Node newNode = new Node(); //Create a new node
        newNode.data = new_data; //Assign data to new node
        newNode.next = head; //Make next of new node as head
        newNode.prev = null; //Make prev of new node as null

        if(head != null){
            head.prev = newNode; //Change prev of head node to new node
        }
        head = newNode; //Move the head to point to the new node
        return head; //Return the new head

    }
    public static void main(String[] args) {
        Node head = null;
        head = push(head, 4);
        head = push(head, 11);
        head = push(head, -3);
        // The list is now: -3 <-> 11 <-> 4
 
        printList(head); // Prints: -3, then 11, then 4, then count.
    }
}
