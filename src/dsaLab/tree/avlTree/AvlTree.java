/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-04-2021
 *   Time: 10:32
 *   File: AvlTree.java
 */

package dsaLab.tree.avlTree;

public class AvlTree {
    AvlNode root;

    int height(AvlNode N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    AvlNode insert(AvlNode node, int data) {
        if (node == null) {
            return new AvlNode(data);
        }
        if (data < node.value) {
            node.leftChild = insert(node.leftChild, data);
        } else if (data > node.value) {
            node.rightChild = insert(node.rightChild, data);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.leftChild), height(node.rightChild));
        int balance = getBalance(node);
        if (balance > 1 && data < node.leftChild.value) {
            return rightRotate(node);
        }
        if (balance < -1 && data > node.rightChild.value) {
            return leftRotate(node);
        }
        if (balance > 1 && data > node.leftChild.value) {
            node.leftChild = leftRotate(node.leftChild);
            return rightRotate(node);
        }
        if (balance < -1 && data < node.rightChild.value) {
            node.rightChild = rightRotate(node.rightChild);
            return leftRotate(node);
        }
        return node;
    }

    AvlNode rightRotate(AvlNode y) {
        AvlNode x = y.leftChild;
        AvlNode T2 = x.rightChild;

        x.rightChild = y;
        y.leftChild = T2;

        y.height = max(height(y.leftChild), height(y.rightChild)) + 1;
        x.height = max(height(x.leftChild), height(x.rightChild)) + 1;

        return x;
    }

    AvlNode leftRotate(AvlNode x) {
        AvlNode y = x.rightChild;
        AvlNode T2 = y.leftChild;

        y.leftChild = x;
        x.rightChild = T2;

        x.height = max(height(x.leftChild), height(x.rightChild)) + 1;
        y.height = max(height(y.leftChild), height(y.rightChild)) + 1;

        return y;
    }

    int getBalance(AvlNode N) {
        if (N == null)
            return 0;

        return height(N.leftChild) - height(N.rightChild);
    }

    public void preOrder(AvlNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }
}