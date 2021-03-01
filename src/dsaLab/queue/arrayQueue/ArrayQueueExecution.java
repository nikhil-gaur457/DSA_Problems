/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 00:52
 *   File: ArrayQueueExecution.java
 */

package dsaLab.queue.arrayQueue;

public class ArrayQueueExecution {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(6);
        queueUsingArray.display();

        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(20);
        queueUsingArray.enqueue(30);
        queueUsingArray.enqueue(15);
        queueUsingArray.enqueue(25);
        queueUsingArray.enqueue(35);

        queueUsingArray.display();

        queueUsingArray.enqueue(50);

        queueUsingArray.display();

        queueUsingArray.dequeue();
        queueUsingArray.dequeue();

        System.out.println("two nodes deleted now..");
        queueUsingArray.display();

        System.out.print("front element is ");
        queueUsingArray.frontOfQueue();

    }
}