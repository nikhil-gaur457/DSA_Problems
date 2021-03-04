/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-03-2021
 *   Time: 19:48
 *   File: DoublyLinkedList.java
 */

package dsaLab.LinkedList.doublyLL;

public class DoublyLinkedList {
    DoublyLLNode head;
    DoublyLLNode last;

    public void insertAtFirst(int data) {
        DoublyLLNode newNode = new DoublyLLNode(data);
        newNode.next = head;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void addAfter(DoublyLLNode prevNode, int data) {
        if (prevNode == null) {
            System.out.println("previous node cannot be null");
            return;
        }
        DoublyLLNode newNode = new DoublyLLNode(data);
        newNode.next = prevNode.next;
        newNode.previous = prevNode;
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        }
    }

    public void add(int data) {
        DoublyLLNode newNode = new DoublyLLNode(data);
        last = head;
        newNode.next = null;
        if (head == null) {
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    public void display(DoublyLLNode doublyLLNode) {
        last = null;
        System.out.println("list in forwarded direction : ");
        while (doublyLLNode != null) {
            System.out.println(doublyLLNode.data + " ");
            last = doublyLLNode;
            doublyLLNode = doublyLLNode.next;
        }
        System.out.println("list in reverse direction : ");
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.previous;
        }
    }
}