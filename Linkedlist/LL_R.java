package Linkedlist;
//Java program to reverse a linkedlist
public class LL_R {
    Node head;
    // Node class
    class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //iterative approach to reverse a linkedlist
    public void reverseIterate() {
        if(head == null || head.next == null){
            return;
        }
        Node prevnode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode =currNode.next;
            currNode.next = prevnode;

            //update the list 
            prevnode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevnode;
    }
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
    public static void main(String[] args){
        LL_R list = new LL_R();
        list.addlast("a");
        list.addlast("c");
        list.addlast("d");
        list.addlast("e");

        list.printlist();
        list.reverseIterate();
        list.printlist();


    }
}
