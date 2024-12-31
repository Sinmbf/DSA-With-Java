package learn.dsa.LinkedList;

class Node{
    public int data;
    public Node next;
    
    // Parameterized constructor
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class DeleteFromLastSingly{
    public static void main(String[]args){
        Node tail=new Node(40,null);
        Node node3= new Node(30,tail);
        Node node2= new Node(20,node3);
        Node head=new Node(10,node2);
        
        // Deletion from last
        Node temp=head;
        Node temp2=new Node(0,null);
        Node temp3=head;
        while(temp.next!=null){
            temp2=temp;
            temp=temp.next;
        }
        temp2.next=null;
        System.out.println("Data being deleted is " + temp.data);
        temp=null;
        while(temp3!=null){
            System.out.println(temp3.data);
            temp3=temp3.next;
        }
    }
}