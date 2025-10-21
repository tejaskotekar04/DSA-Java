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

    //'append' method that returns head for empty list case
    static Node append(Node head, int newData){
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = null;

        if(head == null){ 
            head = newNode; // If list is empty, new node becomes the head
            return head;
        }
 
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        // Append the new node at the end
        lastNode.next = newNode;
        return head; 
    }
    public static void main(String[] args) {
        Node head = null;

        head = push(head, 79);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, -3);
        // -3 -> 7 -> 5 -> 79

        append(head, 90);
        // -3 -> 7 -> 5 -> 79 -> 90

        printList(head);
    }


}
