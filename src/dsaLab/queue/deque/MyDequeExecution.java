/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 01:39
 *   File: MyDequeExecution.java
 */

package dsaLab.queue.deque;

public class MyDequeExecution {
    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque(4);
        System.out.println("Insert element at front : 15");
        myDeque.insertAtFront(15);
        System.out.println("Insert element at front : 25");
        myDeque.insertAtFront(25);
        System.out.println("Insert element at front : 35");
        myDeque.insertAtFront(35);
        System.out.println("rear element is " + myDeque.getRear());
        myDeque.deleteAtRear();
        System.out.println("After delete rear element new rear is : " + myDeque.getRear());
        System.out.println("Insert element at front : 76");
        myDeque.insertAtFront(76);
        System.out.println("get from element " + myDeque.getFront());
        myDeque.deleteAtFront();
        System.out.println("After delete front element, new front is : " + myDeque.getFront());
    }
}