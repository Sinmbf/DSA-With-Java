package learn.dsa.LinkedList;

import java.util.Scanner;

class Node {

    int data;
    Node next;

    // Constructor to set values
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class InsertionAnywhereLinkedList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create a linked list (1->2->3)
        Node node3 = new Node(30, null);
        Node node2 = new Node(20, node3);
        Node node1 = new Node(10, node2);
        Node head = new Node(9, node1);
        int count = 1;

        Node newNode = new Node(5, null);

        System.out.println("Enter the position where you want to insert the node: ");
        int position = sc.nextInt();
        
        while(position==0){
            System.out.println("Position start from 1. Please enter again: ");
            position=sc.nextInt();
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;  // head -> newNode
        } else {
            Node temp1, temp2;
            temp1 = head; // temp1 -> head
            while (temp1 != null) {
                count++;
                temp2 = temp1;
                temp1 = temp1.next;
                /**
                 * For position =3: 
                 * temp2 -> temp1 (head) 
                 * temp1 -> temp1.next (node1)
                 *
                 * temp2 -> temp1 (node1) 
                 * temp1 -> temp1.next (node2)
                 *
                 * when position found: 
                 * newNode.next -> temp1 (node2)
                 * temp2(node1).next -> newNode
                 */
                if (count == position) {
                    newNode.next = temp1;
                    temp2.next = newNode;
                    break;
                }
            }
        }

        if (position > count) {
            System.out.println("Position out of reach");
        } else {
            Node temp = head;
            System.out.println("Updated linked list: ");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }
}
