/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-03-2021
 *   Time: 10:29
 *   File: Node.java
 */

package dsaLab.tree;

public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        value = data;
        leftChild = null;
        rightChild = null;
    }
}