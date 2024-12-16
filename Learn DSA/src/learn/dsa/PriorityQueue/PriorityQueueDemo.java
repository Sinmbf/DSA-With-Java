package learn.dsa.PriorityQueue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueDemo{
    public static void main(String[]args){
        
        /**
         * Priority Queue => A data structure that stores elements with
         *                   the highest priorities first before elements with
         *                   lower priority.
         * 
         *                   High-priority elements are dequeued before lower-priority ones, 
         *                   regardless of the order they were enqueued.
         */
        
        // Create a priority queue of Double objects
        Queue<Double> gpaQueue=new PriorityQueue<>(Collections.reverseOrder());
        
        // Create a priority queue of String objects
        Queue<String> gradeQueue=new PriorityQueue<>(Collections.reverseOrder());
        
        // Add elments in the queue
        gpaQueue.offer(2.5);
        gpaQueue.offer(3.0);
        gpaQueue.offer(1.5);
        gpaQueue.offer(4.0);
        
        gradeQueue.offer("A");
        gradeQueue.offer("D");
        gradeQueue.offer("C");
        gradeQueue.offer("B");
        
        // Display elements of the queue (in ascending order normally, if reverseOrder then descending)
        while(!gpaQueue.isEmpty()){
            System.out.println(gpaQueue.poll()); // Removes the highest priority at first
        }
        System.out.print("\n");
        
        // Display elements of the queue (in ascending order normally, if reverseOrder then descending)
        while(!gradeQueue.isEmpty()){
            System.out.println(gradeQueue.poll()); // Removes the highest priority at first
        }
        
        
        
    }
}