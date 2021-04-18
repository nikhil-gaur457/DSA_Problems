/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-04-2021
 *   Time: 10:33
 *   File: AvlMain.java
 */

package dsaLab.tree.avlTree;

public class AvlMain {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 100);

        System.out.println("Tree is ->");
        tree.preOrder(tree.root);

    }
}
// Q1: 50, 60, 70, 30, 20, 10, 90, 100
// Q2: 15, 20, 11, 5, 50, 4, 13, 12
// Q3: 30, 20, 40, 10, 5, 3, 4, 50, 60, 70, 65