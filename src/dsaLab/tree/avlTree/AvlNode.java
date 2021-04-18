/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-04-2021
 *   Time: 10:22
 *   File: AvlNode.java
 */

package dsaLab.tree.avlTree;

/* AVL Tree (Balanced Binary Search Tree) :->
*  Rotations in AVL Tree:
*  L L rotation: Inserted node is in the left subtree of left subtree of A.
   R R rotation : Inserted node is in the right subtree of right subtree of A.
   L R rotation : Inserted node is in the right subtree of left subtree of A.
   R L rotation : Inserted node is in the left subtree of right subtree of A. */
public class AvlNode {
    int value;
    int height;
    AvlNode leftChild;
    AvlNode rightChild;

    // Constructor
    public AvlNode(int data) {
        value = data;
        this.height = 1;
        this.leftChild = null;
        this.rightChild = null;
    }
}