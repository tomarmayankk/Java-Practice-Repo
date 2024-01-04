package Linkedlist;
import java.util.*;
//Implementation of linkedlist using collection framework
public class LL_C {
    public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();
    //to add an elemet
    list.add("m");
    list.add("k");

    //to add an element at first and last
    list.addFirst("n");
    list.addLast("t");
    System.out.println(list);

    //to add an element at specific index
    list.add(3, "o");

    //to remove an element
    list.remove(3);

    //to remove element from first and last
    list.removeFirst();
    list.removeLast();

    System.out.println(list);
    }

}
