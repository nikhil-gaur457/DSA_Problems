/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-03-2021
 *   Time: 20:12
 *   File: DoublyLinkedListMain.java
 */

package dsaLab.LinkedList.doublyLL;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(5);
        doublyLinkedList.insertAtFirst(4);
        doublyLinkedList.insertAtFirst(3);
        doublyLinkedList.add(7);
        doublyLinkedList.addAfter(doublyLinkedList.head.next.next, 6);
        doublyLinkedList.display(doublyLinkedList.head);
    }
}