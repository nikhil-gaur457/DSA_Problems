/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-03-2021
 *   Time: 11:32
 *   File: Main.java
 */

package dsaLab.tree.linkedListBT;

public class Main {
    public static void main(String[] args) {
        BTByLinkedList bt = new BTByLinkedList();
        bt.root = new Node(1);
        bt.root.leftChild = new Node(2);
        bt.root.leftChild.leftChild = new Node(4);
        bt.root.rightChild = new Node(3);
        bt.root.rightChild.leftChild = new Node(6);
        bt.root.rightChild.rightChild = new Node(7);
        bt.display(bt.root);
    }
}