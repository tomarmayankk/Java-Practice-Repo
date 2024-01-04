package Linkedlist;
//implementation of linkedlist from Scratch and some operations on it
public class LL {
    //create a function to get the size of the linked list

    private int size;
    LL(){
        this.size = 0;
    }
    
    // Node class
    class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    // Head of the linked list
    Node head;
    
    // Add to the beginning of the list
    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // Add to the end of the list
    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newnode;
    }

    //delete operation on linked list
    //delete from begining of list
    public void deletefirst(String data) {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }
    //delete from last
    public void deletelast(String data) {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        //traverse list to find the node
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;


    }

    // Print the linked list
    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    //get the size of the linked list
    public int getsize(){
        return size;

    }

    public static void main(String[] args) {
        LL list = new LL();
        
        // Adding nodes to the beginning of the linked list
        list.addfirst("A");
        list.addfirst("B");
        list.addfirst("C");

        // Displaying the linked list
        System.out.println("Linked list:");
        list.printlist();

        // Adding nodes to the end of the linked list
        list.addlast("D");
        list.addlast("E");

        // Displaying the linked list again
        System.out.println("Linked list after adding nodes to the end:");
        list.printlist();

        list.deletefirst("C");
        list.printlist();

        list.deletelast("E");
        list.printlist();

        System.out.println(list.getsize());
    }
}
