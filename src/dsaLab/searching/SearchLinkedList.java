/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 24-06-2021
 *   Time: 21:51
 *   File: SearchLinkedList.java
 */

package dsaLab.searching;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SearchLinkedList {
    Node head;

    public static void main(String[] args) {
        SearchLinkedList searchLinkedList = new SearchLinkedList();
        searchLinkedList.push(10);
        searchLinkedList.push(30);
        searchLinkedList.push(11);
        searchLinkedList.push(21);
        searchLinkedList.push(14);
        if (searchLinkedList.search(searchLinkedList.head, 21)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }
}