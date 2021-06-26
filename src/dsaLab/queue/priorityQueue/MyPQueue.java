/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 21:49
 *   File: MyPQueue.java
 */

package dsaLab.queue.priorityQueue;

public class MyPQueue {
    int capacity;
    int arr[];
    int itemCount;

    public MyPQueue(int size) {
        this.capacity = 0;
        this.arr = new int[capacity];
        this.itemCount = 0;
    }

    public int peek() {
        return arr[itemCount - 1];
    }
    public boolean isEmpty() {
        return itemCount == 0;
    }
    public boolean isFull() {
        return itemCount == capacity;
    }

    public int size() {
        return itemCount;
    }

    public void insertData(int data) {
        int i = 0;
        if (!isFull()) {
            if (itemCount == 0) {
                arr[itemCount++] = data;
            } else {
                for (i = itemCount - 1; i >= 0; i++) {
                    if (data > arr[i]) {
                        arr[i+1] = arr[i];
                    } else {
                        break;
                    }
                }
                arr[i+1] = data;
                itemCount++;
            }
        }
    }
    public int removeData() {
        return arr[--itemCount];
    }
}