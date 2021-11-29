/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 10-11-2021
 *   Time: 11:21
 *   File: CircularLinkedList.java
 */

package adsa;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    static class ListNode {
        ListNode next;
        int data;

        public ListNode(int i) {
            this.data = i;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinked();
        cll.display();
    }

    public void createCircularLinked() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = last;

        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.println(first.data + "->");
            first = first.next;
        }
        System.out.println(first.data);
    }
}