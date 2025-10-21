package Collections;

import java.util.List;
import java.util.ArrayList;

class Simple{
public static void main(String[] args) {
    
    //Creating a list using ArrayList class
    List<Integer> list1= new ArrayList<>();

    //add elements to list
    list1.add(1);
    list1.add(2);
    list1.add(3);
    System.out.println("List: " +list1);

    //Access elements from the list
    int element=list1.get(2);
    System.out.println("Accessed element: "+element);

    //Remove elements from the list
    int Removedelement=list1.remove(1);
    System.out.println("Removed element: "+Removedelement);
}
}