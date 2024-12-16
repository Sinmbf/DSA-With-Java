package learn.dsa.LinkedList;

class Node{
    int data;
    Node nextAddress;
    
    // Constructor to set values
    Node(int data, Node nextAddress){
        this.data=data;
        this.nextAddress=nextAddress;
    }
}

public class CreateAndDisplayLinkedList{
    public static void main(String[]args){
        // Create linked list
        Node tail=new Node(30,null);
        Node node2=new Node(40,tail);
        Node node3=new Node(50,node2);
        Node head=new Node(60,node3);
        
        Node tempHead=head;
        
        while(tempHead!=null){
            System.out.println(tempHead.data);
            tempHead= tempHead.nextAddress;
        }
    }
}