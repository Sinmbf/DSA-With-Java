package learn.dsa.LinkedList;

class DoublyNode{
    public DoublyNode prev;
    public int data;
    public DoublyNode next;
    
    // Parameterized constructor
    DoublyNode(int data,DoublyNode next){
        this.data=data;
        this.next=next;
    }
}

public class DeletionFromFirstDoubly {
    public static void main(String[]args){
        // Create Doubly Linked List
        DoublyNode tail=new DoublyNode(40,null);
        DoublyNode node3=new DoublyNode(30,tail);
        DoublyNode node2=new DoublyNode(20,node3);
        DoublyNode head=new DoublyNode(10,node2);
        tail.prev=node3;
        node3.prev=node2;
        node2.prev=head;
        head.prev=null;
        
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        head=node2;
        System.out.println("Data being deleted is " + head.prev.data);
        head.prev=null;
        DoublyNode temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
                
    }
}
