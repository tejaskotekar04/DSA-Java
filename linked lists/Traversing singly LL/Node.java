class Node{
    int data;
    Node next;

//Iteractive traversal of a singly linked list
static void printList(Node head){
    Node curr = head;
    while(curr != null){
        System.out.println(curr.data);
        curr = curr.next;
    }
}

/*Recursive traversal of a singly linked list-:
static void printList(Node head){
    if(head == null)
    return;
    System.out.println(head.data);
    printListRec(head.next);
}*/

public static void main(String[] args) {
    //Initially the linked list is empty
    
    Node head = new Node(); //Creating the head node
    //Assigning data to the head node( first node) as 2
    head.data = 2; //Assigning data in the head node
    head.next = null; //Next of head node is null

    Node second = new Node(); //Creating the second node
    second.data = 3; //Assigning data in the second node
    second.next= null; //Next of second node is null
    head.next = second; //Linking the first node with the second node.Now head node points to second node

    Node third = new Node(); //Creating the third node
    third.data = 5; //Assigning data in the third node
    third.next = null; //Next of third node is null
    second.next = third; //Linking the second node with the third node. Now second node points to third node

    Node fourth = new Node(); //Creating the fourth node
    fourth.data = 6; //Assigning data in the fourth node
    fourth.next = null; //Next of fourth node is null
    third.next = fourth; //Linking the third node with the fourth node. Now third node points to fourth node

    //The linked list is: 2 → 3 → 5 → 6 → null
    printList(head); //Calling the static method to print the linked list
}
}