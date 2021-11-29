/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-11-2021
 *   Time: 11:40
 *   File: StackMain.java
 */

package adsa.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.pop();
        System.out.println(stack.peek());
    }
}