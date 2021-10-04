/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 24-06-2021
 *   Time: 21:06
 *   File: Node.java
 */

package dsaSelf.Array;

class SinglyLinkedList {
    int key;
    SinglyLinkedList next;

    SinglyLinkedList(int n) {
        key = n;
        next = null;
    }
}

class LinkedList {
    static SinglyLinkedList head;

    public LinkedList() {
        head = null;
    }

    // Driver code
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(new SinglyLinkedList(1));
        l1.insert(new SinglyLinkedList(8));
        l1.insert(new SinglyLinkedList(6));
        l1.insert(new SinglyLinkedList(2));
        l1.printList();
    }

    void insert(SinglyLinkedList n) {
        if (head == null) {
            head = n;
        } else {
            SinglyLinkedList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    // Function to print the linked list
    void printList() {
        SinglyLinkedList ptr = head;

        while (ptr != null) {
            System.out.print(ptr.key + "->");
            ptr = ptr.next;
        }
        System.out.print("null" + "\n");
    }

    void addDigit(int n) {
        SinglyLinkedList lastSinglyLinkedList = null;
        SinglyLinkedList curr = head;

        while (curr.next != null) {
            if (curr.key < 9)
                lastSinglyLinkedList = curr;
            curr = curr.next;
        }
        curr.key = curr.key + n;
        if (curr.key > 9) {
            curr.key = curr.key % 10;
            if (lastSinglyLinkedList == null) {
                insert(new SinglyLinkedList(1));
                lastSinglyLinkedList = head.next;
            }
            while (lastSinglyLinkedList != curr) {
                lastSinglyLinkedList.key = (lastSinglyLinkedList.key + 1) % 10;
                lastSinglyLinkedList = lastSinglyLinkedList.next;
            }
        }
    }
}