/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-03-2021
 *   Time: 11:31
 *   File: BTByLinkedList.java
 */

package dsaLab.tree.linkedListBT;

import java.util.LinkedList;
import java.util.Queue;

public class BTByLinkedList {
    Node root;
    Node temp = root;
    public void insert(Node temp, int data) {
        if (temp == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.leftChild == null) {
                temp.leftChild = new Node(data);
                break;
            } else {
                q.add(temp.leftChild);
            }
            if (temp.rightChild == null) {
                temp.rightChild = new Node(data);
            } else {
                q.add(temp.rightChild);
            }
        }
    }

    public void display(Node temp) {
        if (temp == null) {
            return;
        }
        display(temp.leftChild);
        System.out.print(temp.value + " ");
        display(temp.rightChild);
    }
}