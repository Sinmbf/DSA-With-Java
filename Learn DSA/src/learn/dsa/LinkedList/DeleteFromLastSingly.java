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
        Node node1=new Node(10,node2);
        Node node0=new Node(5,node1);
        Node head=new Node(0,node0);
        
        Node temp1=head;
        Node temp2=head.next;
        Node temp3=head;
        
        while(temp2.next!=null){
            temp1=temp2;
            temp2=temp2.next;
        }
        
        if(temp2.next==null){
            System.out.println("Data being deleted is " + temp2.data);
            temp2=null;
            temp1.next=null;
        }
        
        while(temp3!=null){
            System.out.println(temp3.data);
            temp3=temp3.next;
        }
        
    }
}