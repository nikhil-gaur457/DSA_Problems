/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-04-2021
 *   Time: 22:25
 *   File: BSTMain.java
 */

package dsaLab.tree.bst;

public class BSTMain {
    public static void main(String[] args) {
        BST tree = new BST();

        Node rootNode = new Node(40);
        Node n1 = new Node(20);
        Node n2 = new Node(60);
        Node n3 = new Node(30);

        tree.insert(null, rootNode);
        tree.insert(rootNode, n1);
        tree.insert(rootNode, n2);
        tree.insert(rootNode, n3);

        tree.preOrder(rootNode);
        Node result = tree.getSuccessor(rootNode);
        System.out.print("successor of root node is : ");
        System.out.println(result.data);
        Node result1 = tree.getPredecessor(rootNode);
        System.out.print("predecessor of root node is : ");
        System.out.println(result1.data);

        Node result2 = tree.delete(rootNode, 40);
        System.out.println("========================");
        tree.preOrder(rootNode);
    }
}