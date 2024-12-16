package learn.dsa.LinkedList;

class Node{
    int data;
    Node next;
    
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class InsertionAtFirstLinkedList{
    public static void main(String[]args){
        // Create a new Node called newNode
        Node newNode=new Node(30,null);
        
        // Create a linked list
        Node tail=new Node(60,null);
        Node node2=new Node(50,tail);
        Node head=new Node(40,node2);
        
        // Insert the new node at the beginning of the linked list
        newNode.next=head;
        head=newNode;
        
        // Create temporary head 
        Node tempHead=head;
        
        // Display the linkedlist data
        while(tempHead!=null){
            System.out.println(tempHead.data);
            tempHead=tempHead.next;
        }
        
    }
}