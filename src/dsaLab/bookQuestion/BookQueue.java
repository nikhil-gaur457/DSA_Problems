/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-03-2021
 *   Time: 18:27
 *   File: BookQueue.java
 */

package dsaLab.bookQuestion;

public class BookQueue {
    int front;
    int rear;
    int capacity;
    BookContaing[] arr;

    public BookQueue(int size) {
        this.capacity = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new BookContaing[size];
    }

    public void enqueue(BookContaing obj) {
        if (isFUll()) {
            System.out.println("Queue is full");
            return;
        } else if (front == rear) {
            front = 0;
            rear = -1;
        }
        rear += 1;
        arr[rear] = obj;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            arr[front] = null;
            front++;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFUll() {
        return rear == capacity - 1;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.println("Book Name: " + arr[i].getBookName() + ", Book price: " + arr[i].getPrice());
            }
        } else {
            System.out.println("Array is Empty!");
        }
    }
}