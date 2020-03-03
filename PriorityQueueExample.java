/**
* Java Doc: https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
*/


import java.util.*;


public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Key> queue = new PriorityQueue<>();
        //Creating Key array 
        Key k1 = new Key(0, 200);
        Key k2 = new Key(1, 250);
        Key k3 = new Key(2, 20);
        Key k4 = new Key(3, 300);
        Key k5 = new Key(4, 105);
        
        queue.add(k1);
        queue.add(k2);
        queue.add(k3);
        queue.add(k4);
        queue.add(k5);
        
       
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for (Key k : queue) {
            System.out.println("vertexId: "+ k.vertexIndex+ " key: "+k.key + " ");
        }
        System.out.println();
        
        System.out.println("peek: " + queue.peek().key+ " vertexId: "+ queue.peek().vertexIndex);
        queue.remove();
        System.out.println();
        System.out.println("After removing one record:");
        for (Key k : queue) {
            System.out.println(k.key + " ");
        }
        
        System.out.println("peek: " + queue.peek().key+ " vertexId: "+ queue.peek().vertexIndex);
        queue.remove();
        System.out.println();
        System.out.println("After removing one record:");
        for (Key k : queue) {
            System.out.println(k.key + " ");
        }
        
        System.out.println();
        System.out.println("peek: " + queue.peek().key+ " vertexId: "+ queue.peek().vertexIndex);
        queue.remove();
        System.out.println();
        System.out.println("After removing one record:");
        for (Key k : queue) {
            System.out.println(k.key + " ");
        }
        
        System.out.println();
        System.out.println("peek: " + queue.peek().key+ " vertexId: "+ queue.peek().vertexIndex);
        queue.remove();
        System.out.println();
        System.out.println("After removing one record:");
        for (Key k : queue) {
            System.out.println(k.key + " ");
        }
        
        System.out.println();
        System.out.println("peek: " + queue.peek().key+ " vertexId: "+ queue.peek().vertexIndex);
        queue.remove();
        System.out.println();
        System.out.println("After removing one record:");
        for (Key k : queue) {
            System.out.println(k.key + " ");
        }
        
        
    }
    
}
