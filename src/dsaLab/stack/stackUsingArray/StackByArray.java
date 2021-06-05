/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-03-2021
 *   Time: 22:47
 *   File: StackByArray.java
 */

package dsaLab.stack.stackUsingArray;

public class StackByArray {
    final int MAX = 1000;
    int top;
    int[] arr = new int[MAX];

    public StackByArray() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int data) {
        if (top >= (MAX - 1)) {
            System.out.println("Overflow");
            return false;
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            int data = arr[top--];
            return data;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            int data = arr[top];
            return data;
        }
    }
}