class Node {
    int data;
    Node next;

    void printCircularList(Node first){ //Any node can be a starting point
         Node temp = first;
         if(first != null){
            System.out.println(temp.data);
            temp = temp.next;

            while(temp != first){
                System.out.println(temp.data);
                temp = temp.next;
            }
         }
    }
    public static void main(String[] args) {
        Node head = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();
        Node sixth = new Node();

        head.data = 1;
        head.next = second;

        second.data = 2;
        second.next = third;    

        third.data = 3;
        third.next = fourth;

        fourth.data = 4;
        fourth.next = fifth;

        fifth.data = 5;
        fifth.next = sixth;

        sixth.data = 6;
        sixth.next = head; //Making the linked list circular

        head.printCircularList(head); //Passing head node as starting point
}
}
