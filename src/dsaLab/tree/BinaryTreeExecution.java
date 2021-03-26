/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-03-2021
 *   Time: 10:33
 *   File: BinaryTreeExecution.java
 */

package dsaLab.tree;

public class BinaryTreeExecution {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.leftChild = new Node(2);
        binaryTree.root.leftChild.leftChild = new Node(4);
        binaryTree.root.leftChild.rightChild = new Node(5);
        binaryTree.root.rightChild = new Node(3);
        /*
         binaryTree.insertRoot(1);
         binaryTree.insertLeftToRoot(2);
         binaryTree.insertLeftToRoot(4);
         binaryTree.insertRightToRoot(5);
         binaryTree.insertRightToRoot(3);
        */
        System.out.println("\t\t" + binaryTree.root.value);
        System.out.println("\t" + binaryTree.root.leftChild.value + "\t\t" + binaryTree.root.rightChild.value);
        System.out.println(binaryTree.root.leftChild.leftChild.value + "\t\t" + binaryTree.root.leftChild.rightChild.value);

    }
}