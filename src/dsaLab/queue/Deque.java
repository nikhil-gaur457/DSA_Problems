/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 23:15
 *   File: Deque.java
 */

package dsaLab.queue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // arrayDeque.add(4);
        // arrayDeque.add(5);
        // arrayDeque.addFirst(45);
        // arrayDeque.pop();
        // System.out.println(arrayDeque);
        // System.out.println(arrayDeque.peek());
        arrayDeque.push(45);
        arrayDeque.push(54);
        arrayDeque.push(65);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
    }
}