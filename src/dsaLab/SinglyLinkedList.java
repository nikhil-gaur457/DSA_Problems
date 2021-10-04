/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 26-06-2021
 *   Time: 13:52
 *   File: SinglyLinkedList.java
 */

package dsaLab;

public class SinglyLinkedList {
    static Node head;

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        list.displayList(head);
        head = list.reverseList(head);
        System.out.println();
        System.out.println("reversed list is : ");
        list.displayList(head);
    }

    public void insert(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void displayList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}