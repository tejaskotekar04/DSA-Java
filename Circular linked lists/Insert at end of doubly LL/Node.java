public class Node {
    int data;
    Node next;
    Node prev;

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
        Node newNode = new Node(); 
        newNode.data = new_data; 
        newNode.next = head; 
        newNode.prev = null; 

        if(head != null){
            head.prev = newNode; 
        }
        head = newNode; 
        return head; 

    }

    //Insert node at the end of doubly linked list
    static void append(Node head, int new_data){
        Node newNode = new Node(); 
        newNode.data = new_data; 
        newNode.next = null; 
        newNode.prev = null;

        if(head == null) { 
            head = newNode;
            return;
        }

        Node last = head; 
        while(last.next != null){ 
            last = last.next;
        }

        last.next = newNode; 
        newNode.prev = last; 
        return;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 4);
        head = push(head, 11);
        head = push(head, -3);
        // The list is now: -3 <-> 11 <-> 4

        append(head, 9); // Insert 10 after 11
        // The list is now: -3 <-> 11 <-> 4 <-> 9
 
        printList(head); 
    }
}

/*
 # Inserting Node E at the End of Doubly Linked List

## Initial State: 4 Nodes A, B, C, D

```
head -> [null|A|→] <-> [←|B|→] <-> [←|C|→] <-> [←|D|null]
```

Visual representation:
```
A ↔ B ↔ C ↔ D
```

Where:
- A.prev = null, A.next = B
- B.prev = A, B.next = C  
- C.prev = B, C.next = D
- D.prev = C, D.next = null

## Step-by-Step Process to Insert E at the End

### Step 1: Create New Node E ->
Node newNode = new Node();  // This is node E
newNode.data = 'E';
newNode.next = null;        // E will be the last node
newNode.prev = null;        // Initialize as null


### Step 2: Find the Last Node (Node D) ->
Node last = head;           // Start from head (A)
while(last.next != null){   // Traverse until we find the last node
    last = last.next;
}
// Now 'last' points to node D


**Traversal Process:**
1. last = A, A.next != null, so continue
2. last = B, B.next != null, so continue  
3. last = C, C.next != null, so continue
4. last = D, D.next == null, so STOP

**Result**: `last` variable now points to node D

### Step 3: Link Node D to Node E
last.next = newNode;        // D.next = E


**Before:**
... <-> [←|D|null]

**After:**
... <-> [←|D|→] -> [null|E|null]

### Step 4: Link Node E back to Node D ->
newNode.prev = last;   // E.prev = D

**Final Result:**
... <-> [←|D|→] <-> [←|E|null]

## Complete Final State

head -> [null|A|→] <-> [←|B|→] <-> [←|C|→] <-> [←|D|→] <-> [←|E|null]

Visual representation:
A ↔ B ↔ C ↔ D ↔ E

Where:
- A.prev = null, A.next = B
- B.prev = A, B.next = C  
- C.prev = B, C.next = D
- D.prev = C, D.next = E  ← **Updated**
- E.prev = D, E.next = null ← **New node**

## Code Implementation

static Node append(Node head, char new_data){
    Node newNode = new Node();      // Create node E
    newNode.data = new_data;        // Set data to 'E'
    newNode.next = null;           // E will be last, so next = null
    newNode.prev = null;           // Initialize prev
    
    if(head == null) {             // If list is empty
        return newNode;            // E becomes the head
    }
    
    Node last = head;              // Start from head (A)
    while(last.next != null){      // Find the last node
        last = last.next;          // Traverse: A -> B -> C -> D
    }
    // Now 'last' points to D
    
    last.next = newNode;           // D.next = E
    newNode.prev = last;           // E.prev = D
    
    return head;                   // Return original head (A)
}

## Summary

You are absolutely correct! Here's what happens:

1. **Node D is identified as the "last" node** (the one with next = null)
2. **D.next becomes E** (connecting D forward to E)
3. **E.prev becomes D** (connecting E backward to D)  
4. **E.next remains null** (since E is now the new last node)

This maintains the doubly-linked property where every node (except first and last) has both forward and backward connections, and the list can be traversed in both directions.

## Memory Visualization-:
Before insertion:
D: [prev: C | data: D | next: null]

After creating E:
E: [prev: null | data: E | next: null]

After linking:
D: [prev: C | data: D | next: E]    ← next updated
E: [prev: D | data: E | next: null] ← prev updated

 */