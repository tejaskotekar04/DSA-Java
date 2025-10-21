class Node {
    int data;
    Node next;
    
    static void printList(Node n){
        int count =0;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
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

static Node deleteNode(Node head, int key) {
//Initialize temp
//store head to temp
Node temp = head;

//if key is present at head
if(temp != null && temp.data == key){
    head = temp.next;
    return head;
}

//Initialize prev
Node prev = null;
//We traverse the linked list and keep track of the previous node
//because we need to change 'prev.next'
while(temp != null && temp.data != key){
    prev=temp; //keep track of previous node
    temp = temp.next; //Move to next node
}

//We traverse whole liked list and did not find the key
if(temp == null){
return head; //key not found, return original/unchanged head
}

//But, if key is found
//remove the node
prev.next = temp.next;
return head; //Return the (possibly unchanged) head pointer

}
    public static void main(String[] args) {
        Node head = null;
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, -3);
        head = push(head, 2);
        head = push(head, 9);
        
        System.out.println("Original list:");
        printList(head); // 9 -> 2 -> -3 -> 7 -> 5

        System.out.println("\nAfter deleting 2:");
        head = deleteNode(head, 2); //Update head with returned value
        printList(head); // 9 -> -3 -> 7 -> 5
    }
}
