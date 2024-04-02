package Linkedlist;
import java.util.Vector;
//java program to find the middle of the linked list
class Node {
    int data;
    Node next;
      Node(int x) {
        data = x;
          next = null;
    }
}
public class LL_M {
    static void pushNode(Node[] head_ref, int data_val)
    {
        // Allocate node
        Node new_node = new Node(data_val);
        // Link the old list to the new node
        new_node.next = head_ref[0];
        // Move the head to point to the new node
        head_ref[0] = new_node;
    }

    // Function to get the middle value of the linked list
    static int getMiddle(Node head)
    {
        // Vector to store the values of all nodes
        Vector<Integer> v = new Vector<>();
        // Traverse through the entire linked list and push
        // all the values into the vector
        while (head != null) {
            v.add(head.data);
            head = head.next;
        }
        // Find the middle index
        int middleIdx = v.size() / 2;
        // Return the value stored at the middle index
        return v.get(middleIdx);
    }
    public static void main(String[] args){
        // Initialize the head of the linked list
        Node[] head = new Node[1];
        // Push nodes into the linked list in reverse order
        for (int i = 5; i > 0; i--) {
            pushNode(head, i);
        }

        // Print the middle value of the linked list
        System.out.println(
            "Middle Value Of Linked List is : "
            + getMiddle(head[0]));

    }
    
}
