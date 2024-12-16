package learn.dsa.LinkedList;

import java.util.LinkedList;

public class LinkedListsDemo{
    public static void main(String[]args){
        
        /**
         * LinkedList => a data structure that stores nodes in 2 parts (data + address).
         *               Nodes are in non-consecutive memory locations.
         *               Elements are linked using pointers. 
         *               
         *                                  Singly LinkedList
         *                  Node                 Node                Node
         *              [data | address] -> [data | address] -> [data | address]  
         * 
         *                                  Doubly LinkedList
         *                             Node                                 Node
         *              [prevAddress | data | nextAddress] <-> [prevAddress | data | nextAddress]
         * 
         *              Advantages:
         *                  1. Dynamic data structure (allocates or de-allocates memory in run time.
         *                  2. Insertion and deletion of nodes in easy. O(1). => constant time
         *                  3. No/low memory waste.
         *              
         *              Disadvantages: 
         *                  1. Greater memory usage (additional pointer).
         *                  2. No random access of elements (no index [i]).
         *                  3. Accessing/searching elements is more time consuming. O(n). => linear 
         *                                                                                   time
         *              
         *              Uses:
         *                  1. implement stacks/queues.
         *                  2. GPS navigation.
         *                  3. music playlist.
         * 
         *              Linked lists can be treated as both stacks and queues
         * 
         */
        
        // Create a linked list
        LinkedList<String> linkedListStack=new LinkedList<>();
        LinkedList<String> linkedListQueue=new LinkedList<>();
        
        // LinkedList as stack (push,pop)
        // Add elements in the linkedlist(stack)
        linkedListStack.push("A");  // last
        linkedListStack.push("B");
        linkedListStack.push("C"); // first
        
        // Remove element from the linkedlist
        linkedListStack.pop(); // remove top element
        
        // LinkedList as queue (offer,poll)
        // Add elements in the linkedlist(queue)
        linkedListQueue.offer("A");
        linkedListQueue.offer("C");
        
        // Insert element in the linkedlist(queue)
        linkedListQueue.add(1,"B");
        
        // Remove element from the linkedlist(queue)
        linkedListQueue.remove("B");
        
        // Search for a particular element
        System.out.println(linkedListQueue.indexOf("A"));
        
        // View the first element of the list
        System.out.println(linkedListQueue.peekFirst());
        
        // View the last element of the list
        System.out.println(linkedListQueue.peekLast());
        
        // Add element in the head of the list
        linkedListQueue.addFirst("0");
        
        // Add element in the tail of the list
        linkedListQueue.addLast("D");
        
        // Remove the first element from the list
        String first=linkedListQueue.removeFirst();
        
        // Remove the last element from the list
        String last= linkedListQueue.removeLast();
        
        // Display the linked list
        System.out.println("Stack: ");
        System.out.println(linkedListStack);
        System.out.println("Queue: ");
        System.out.println(linkedListQueue);
        
        
    }
}