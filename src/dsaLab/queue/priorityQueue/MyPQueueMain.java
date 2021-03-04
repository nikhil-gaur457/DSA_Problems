/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 22:23
 *   File: MyPQueueMain.java
 */

package dsaLab.queue.priorityQueue;

public class MyPQueueMain {
    public static void main(String[] args) {
        MyPQueue myPQueue = new MyPQueue();
        myPQueue.insertData(3);
        myPQueue.insertData(4);
        myPQueue.insertData(5);
        System.out.println(myPQueue.peek());
    }
}