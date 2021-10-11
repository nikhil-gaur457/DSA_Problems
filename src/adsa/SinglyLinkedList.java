/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-10-2021
 *   Time: 11:40
 *   File: SinglyLinkedList.java
 */

package adsa;

public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();


        sll.insertAtBeginning(15);
        sll.insertAtBeginning(2);
        sll.display();

        sll.insertAtEnd(20);
        sll.display();

        sll.deleteAtFirst();
        sll.display();

        sll.deleteAtLast();
        sll.display();

        sll.insert(3,12);
        sll.display();
        sll.insert(9, 125);
        sll.display();

        sll.delete(5);
        sll.display();
        System.out.println("length of list " + sll.length());
    }

    // method to insert new node at the beginning.
    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // method to insert new node at the end.
    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // method to delete node at the front.
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            head = head.next;
        }
    }

    // method to delete node from last.
    public void deleteAtLast() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        assert previous != null;
        previous.next = null;
    }

    // method to insert the node the given position.
    public void insert(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else if (position>1 && position <= length()){
            ListNode previous = head;
            int count = 1;
            while (count < position-1) {
                previous = previous.next;
                count++;
            }
            newNode.next = previous.next;
            previous.next = newNode;
        } else {
            System.out.println("invalid position");
        }
    }

    // method to delete the node the given position.
    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position-1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // method to find the length of list.
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // method to display the list.
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Static class for ListNode.
    private static class ListNode {
        private final int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}