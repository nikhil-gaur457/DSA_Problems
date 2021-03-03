/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 23:51
 *   File: StackByArrayMain.java
 */

package dsaLab.Stack.stackUsingArray;

public class StackByArrayMain {
    public static void main(String[] args) {
        StackByArray stackByArray = new StackByArray();
        stackByArray.push(15);
        stackByArray.push(25);
        stackByArray.push(35);
        stackByArray.push(45);
        stackByArray.push(55);
        stackByArray.pop();
        System.out.println(stackByArray.peek());
    }
}