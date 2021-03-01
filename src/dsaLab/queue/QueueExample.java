/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-03-2021
 *   Time: 23:54
 *   File: ArrayQueue.java
 */

package dsaLab.queue;

import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(45);
        arrayDeque.add(2);
        System.out.println(arrayDeque);
        arrayDeque.remove();
        arrayDeque.poll();
        System.out.println(arrayDeque);
    }
}