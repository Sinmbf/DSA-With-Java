package learn.dsa.LinkedList;

// Helper class to represent individual nodes
class Node{
    int data;
    Node next;
    
    // Constructor to set values
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

// Primary class to manage Node objects as a collection
public class LinkedList{
    // Create an empty head
    Node head;
    
    // Method to insert node at the beginning
    public void insertAtBeginning(int newData){
        // Create a new node to insert
        Node newNode=new Node(newData,head); // At first, next=null
        head=newNode;
        System.out.print(head.next + "\n" + newNode.next);
    }
    
    // Method to display the linkedlist
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=head.next;
        }
    }
    
    public static void main(String[]args){
        LinkedList list=new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.display();
    }
}