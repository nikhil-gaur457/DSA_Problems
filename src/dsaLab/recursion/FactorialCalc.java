/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-02-2021
 *   Time: 11:18
 *   File: FactorialCalc.java
 */

package dsaLab.recursion;

import java.util.Scanner;

// class for printing the factorial of a given number using recursion concept
public class FactorialCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            System.out.println("please enter positive number");
        } else {
            System.out.println("Factorial of " + number + " = " + calculateFactorial(number));
        }
    }

    // method to calculate the factorial used in main class
    private static int calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
}