package learn.dsa.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo{
    public static void main(String[]args){
        
        /**
         * Queue => FIFO data structure (First-In First-Out)
         *          A collection designed for holding elements prior to processing.
         *          Linear data structure (one by one)
         *          First come, first serve
         * 
         *          add => enqueue (add element to the last), offer()
         *          remove => dequeue (remove element from the first), poll()
         * 
         * Uses of Queue:
         *          1. Keyboard Buffer letters should appear on the screen in the order
         *             they're pressed.
         *          2. Printer Queue (print jobs should be completed in order)
         *          3. Used in LinkedLists, PriorityQueues, Breadth-first search.
         * 
         * Queue is an interface so it's object can't be created. 
         * So we need, to use a class that implements Queue. (LinkedList, PriorityQueue)
         */
        Queue<String> lineOfPeople=new LinkedList<>();
        
        // Add element in the queue
        lineOfPeople.offer("Karen");
        lineOfPeople.offer("Chad");
        lineOfPeople.offer("Steve");
        lineOfPeople.offer("Harold");
        
        // Check if queue is empty 
        System.out.println("Queue empty = " + lineOfPeople.isEmpty()); // inherited method
        
        // Remove element from the queue (first-in first-out)
        lineOfPeople.poll();
        
        // Veiw the elements in the queue
        System.out.println("Queue: " + lineOfPeople);
        
        // View the size of the queue
        System.out.println("Size of queue: " + (lineOfPeople.size())); // Inherited method
        
        // Examine the first element in the queue
        System.out.println("First element: " + (lineOfPeople.peek())); // no error even if empty
        
        // Check if the queue contains a specific element (inherited method)
        System.out.println("Queue contains Chad: " + (lineOfPeople.contains("Chad")));
        
    }
}