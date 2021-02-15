/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-02-2021
 *   Time: 23:58
 *   File: SinglyLinkedListExecution.java
 */

package dsaLab.LinkedList;

public class SinglyLinkedListExecution {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        NodeLinkedList n1 = new NodeLinkedList();
        n1.data = 10;
        NodeLinkedList n2 = new NodeLinkedList();
        n2.data = 20;
        NodeLinkedList n3 = new NodeLinkedList();
        n3.data = 30;
        obj.insertAtLast(n1);
        obj.insertAtLast(n2);
        obj.insertAtLast(n3);

        NodeLinkedList n4 = new NodeLinkedList();
        n4.data = 40;
        NodeLinkedList n5 = new NodeLinkedList();
        n5.data = 50;
        obj.insertAtBeginning(n4);
        obj.deleteAtBeginning();
        System.out.println("output");
        NodeLinkedList n6 = new NodeLinkedList();
        n6.data = 100;
        obj.deleteAtLast();
        obj.insertAtLast(n6);
        obj.display();
    }
}