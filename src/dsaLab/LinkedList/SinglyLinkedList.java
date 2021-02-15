/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-02-2021
 *   Time: 23:54
 *   File: SinglyLinkedList.java
 */

package dsaLab.LinkedList;

public class SinglyLinkedList {
    NodeLinkedList head;

    public void SingleLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtBeginning() {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            head = head.next;
        }
    }

    public void deleteAtLast() {
        if (isEmpty()) {
            System.out.println("Empty List");
        } else {
            NodeLinkedList current = head;
            NodeLinkedList previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            if (current == head) {
                head = null;
            } else {
                previous.next = null;
            }
        }

    }

    public void insertAtLast(NodeLinkedList newnode) {
        if (head == null) {
            head = newnode;
        } else {
            NodeLinkedList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public int nodecount() {
        NodeLinkedList temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count = count + 1;
        }
        return count;
    }

    public void insertAtBeginning(NodeLinkedList newnode) {
        newnode.next = head;
        head = newnode;
    }


    public void display() {
        NodeLinkedList temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}