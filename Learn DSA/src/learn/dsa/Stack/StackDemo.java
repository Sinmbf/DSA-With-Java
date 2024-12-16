package learn.dsa.Stack;

import java.util.Stack;


public class StackDemo{
    public static void main(String[] args){
        
        /**
         * Stack -> LIFO data structure (Last-In First-Out)
         *          stores objects into a sort of "vertical tower"
         *          push() to add to the top
         *          pop() to remove from the top
         * 
         * Uses of stack: 
         *          1. undo/redo features in text editors
         *          2. moving back/forward through browser history
         *          3. backtracking algorithms (maze, file directories)
         *          4. calling functions (call stack)
         */
        
         // Declare a stack of string objects
         Stack<String> gameStack=new Stack<>();
         
         // Add objects inside the stack
         gameStack.push("Clash of clans");
         gameStack.push("Free fire");
         gameStack.push("Mobile legends");
         gameStack.push("PUBG");
         
         // Display the objects in the stack
         System.out.println("Stack: " + gameStack);
         
         // View the topmost object in the stack
         System.out.println("Topmost object: " + (gameStack.peek()));
         
         // Remove the top object from the stack
         String removedObj= gameStack.pop();  // returns the removed object
         
         // Display the removed object from the stack
         System.out.println("Removed from stack: " + removedObj); 
         
         // Find the position of a object in the stack (starts from 1), not found then -1
         System.out.println("Position of Mobile legends: " + (gameStack.search("Mobile legends"))); 
         
         // Check if stack is empty or not
         System.out.println("Stack empty = " + gameStack.empty());
    }
}