/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-04-2021
 *   Time: 22:25
 *   File: BST.java
 */

package dsaLab.tree.bst;

public class BST {
    public Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (root.data > newNode.data) {
            if (root.leftChild == null) {
                root.leftChild = newNode;
            } else {
                insert(root.leftChild, newNode);
            }
        } else if (root.data < newNode.data) {
            if (root.rightChild == null) {
                root.rightChild = newNode;
            } else {
                insert(root.rightChild, newNode);
            }
        }
        return root;
    }

    public Node getSuccessor(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.rightChild;
        while (temp.leftChild != null) {
            temp = temp.leftChild;
        }
        return temp;
    }

    public Node getPredecessor(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.leftChild;
        while (temp.rightChild != null) {
            temp = temp.rightChild;
        }
        return temp;
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.data) {
            root.leftChild = delete(root.leftChild, value);
        } else if (value > root.data) {
            root.rightChild = delete(root.rightChild, value);
        } else {
            if (root.leftChild == null || root.rightChild == null) {
                Node temp;
                temp = root.leftChild == null ? root.rightChild : root.leftChild;
                return temp;
            } else {
                Node successor = getSuccessor(root);
                root.data = successor.data;
                root.rightChild = delete(root.rightChild, root.data);
                return root;
            }
        }
        return root;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
}