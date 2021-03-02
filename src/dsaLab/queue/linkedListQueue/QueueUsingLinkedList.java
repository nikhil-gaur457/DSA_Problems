/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 20:01
 *   File: QueueUsingLinkedList.java
 */

package dsaLab.queue.linkedListQueue;

public class QueueUsingLinkedList {
    QNode front;
    QNode rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    // method to add the element
    public void enqueue(int data) {
        QNode temp = new QNode(data);
        if (this.rear == null) {
            this.front = temp;
            this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    // method to delete the element
    public void dequeue() {
        if (this.front == null) {
            return;
        }
        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
    }

    // method to display the element
    public void display() {
        QNode temp = front;
        if (front == rear) {
            System.out.println("Queue is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}