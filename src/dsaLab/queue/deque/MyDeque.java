/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 23:44
 *   File: MyDeque.java
 */

package dsaLab.queue.deque;

public class MyDeque {
    int front;
    int rear;
    int size;
    int[] arr;

    public MyDeque(int size) {
        this.size = size;
        front = -1;
        rear = 0;
        arr = new int[size];
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1);
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void insertAtFront(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        arr[front] = data;
    }

    public void insertAtRear(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        arr[rear] = data;
    }

    public void deleteAtFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
    }

    public void deleteAtRear() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear - 1;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[rear];
    }
}