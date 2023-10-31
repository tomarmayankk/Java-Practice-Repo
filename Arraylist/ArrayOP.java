package Arraylist;
import java.util.ArrayList;
import  java.util.Collections;

// this program is about to show various operations in arraylist which are- Declare an ArrayList of different Types
// Add Element
// Get Element
// Add Element at a specific Index
// Set Element at a specific Index
// Delete Element from an Index
// Size of the List
// Loop/Iterate on the List
// Sort the List
public class ArrayOP {
    public static void main(String[] args) {
        //defining arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        //to add an element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list is " + list);

        //to get an element
        int element = list.get(0);
        System.out.println("the required elemnt is " + element);
        
        //to add an element in between
        list.add(1,4); //1 is the index and 2 is the element
        System.out.println("after adding the elements in the list "+ list);

        //to set an element at a specific index
        list.set(1,5);
        System.out.println("after setting the element "+ list);

        //to delete an element from an index
        list.remove(1);
        System.out.println("after deleting the element"+ list);
        
        //to get the size of the list
        System.out.println("the size of the list is "+ list.size());
        
        //to iterate on the list

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    
        //to sort the list
        Collections.sort(list);
        System.out.println(list);

    }   
}
