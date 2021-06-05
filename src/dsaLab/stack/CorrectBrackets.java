/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-02-2021
 *   Time: 10:55
 *   File: CorrectBrackets.java
 */

package dsaLab.stack;

import java.util.Scanner;
import java.util.Stack;

// class to print if the string is balanced or not
public class CorrectBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the string : ");
        String braces = scanner.nextLine();
        System.out.println("Is String Balanced? : " + checkBrackets(braces));
    }

    // method to check the string is balanced using stack
    public static boolean checkBrackets(String braces) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '[') {
                stack.push(braces.charAt(i));
            } else if (braces.charAt(i) == ')' || braces.charAt(i) == '}' || braces.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '(' && braces.charAt(i) == ')') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '{' && braces.charAt(i) == '}') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '[' && braces.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    // METHOD TO CHECK ONLY PARENTHESIS
    public static boolean check(String braces) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(') {
                stack.push('(');
            } else if (braces.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}