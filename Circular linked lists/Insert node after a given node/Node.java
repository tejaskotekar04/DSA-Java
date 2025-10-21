public class Node {
    int data;
    Node next;
    Node prev; // For doubly linked list
    
    //Print the doubly linked list
    static void printList(Node n){
        int count = 0;
        while(n != null){
            System.out.println(n.data);
            n=n.next;
            count++;
        }
        System.out.println("The number of elements in doubly linked list are: " + count);
    }
  
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

     //Insert a node in middle of doubly linked list
     //Insert a node after a given node
     static void insertAfter(Node prev_node, int new_data){

        if(prev_node == null){
            System.out.println("The given previous node can't be null");
            return;
        }
        Node newNode = new Node(); //Create a new node
        newNode.data = new_data; //Assign data to new node
        newNode.next = prev_node.next; //Make next of new node as next of prev_node
        prev_node.next = newNode;
        newNode.prev = prev_node; //Make prev of new node as prev_node
     
        if(newNode.next != null){
           newNode.next.prev = newNode;
        }
    }

       public static void main(String[] args) {
        Node head = null;
        head = push(head, 4);
        head = push(head, 11);
        head = push(head, -3);
        // The list is now: -3 <-> 11 <-> 4

        insertAfter(head.next, 10); // Insert 10 after 11
        // The list is now: -3 <-> 11 <-> 10 <-> 4
 
        printList(head); 
    }
    
}
