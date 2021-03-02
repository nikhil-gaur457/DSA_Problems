/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 20:09
 *   File: MainQueueByLL.java
 */

package dsaLab.queue.linkedListQueue;

public class MainQueueByLL {
    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.display();
        System.out.println("Now adding elements, so queue is :");
        queueUsingLinkedList.enqueue(10);
        queueUsingLinkedList.enqueue(20);
        queueUsingLinkedList.enqueue(30);
        queueUsingLinkedList.enqueue(15);
        queueUsingLinkedList.display();
        System.out.println();
        System.out.println("Adding two more elements in queue : ");
        queueUsingLinkedList.enqueue(25);
        queueUsingLinkedList.enqueue(35);
        queueUsingLinkedList.display();
        System.out.println();
        System.out.println("delete two elements from queue : ");
        queueUsingLinkedList.dequeue();
        queueUsingLinkedList.dequeue();
        queueUsingLinkedList.display();
        System.out.println();
        System.out.println("front of queue is " + queueUsingLinkedList.front.data);
        System.out.println("rear of the queue is " + queueUsingLinkedList.rear.data);
        queueUsingLinkedList.display();
    }
}