/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-04-2021
 *   Time: 22:25
 *   File: BST.java
 */

package dsaLab.tree.bst;

public class BST {
    // method to insert the root value.
    public void insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return;
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
    }

    // this method will print the successor of the bs tree.
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

    // this method will print the predecessor of the bs tree.
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

    // method to delete the node
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

    // preOrder will print as [root value, left of root, right of root]
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ", ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    // postOrder will print as [left of root, right of root, root value]
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data + ", ");
    }

    // inOrder will print as [left of root, root value, right of root]
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data + ", ");
        inOrder(root.rightChild);
    }
}