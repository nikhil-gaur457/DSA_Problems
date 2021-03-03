/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 19:37
 *   File: PriorityQueue.java
 */

package dsaLab.queue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
        priorityQueue.add(15);
        priorityQueue.add(25);
        priorityQueue.add(35);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
    }
}