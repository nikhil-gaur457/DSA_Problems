/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 00:22
 *   File: QueueUsingArray.java
 */

package dsaLab.queue.arrayQueue;

public class QueueUsingArray {
    int front;
    int rear;
    int capacity;
    int[] queueUsingArray;

    QueueUsingArray(int size) {
        this.capacity = size;
        this.front = 0;
        this.rear = 0;
        this.queueUsingArray = new int[capacity];
    }

    public void enqueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            queueUsingArray[rear] = data;
            rear++;
        }
        return;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queueUsingArray[i] = queueUsingArray[i + 1];
            }
            if (rear < capacity)
                queueUsingArray[rear] = 0;
            rear--;
        }
        return;
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.println(queueUsingArray[i]);
        }
        return;
    }

    public void frontOfQueue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queueUsingArray[front]);
        return;
    }

}