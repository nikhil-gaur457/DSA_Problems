/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-02-2021
 *   Time: 11:37
 *   File: GCDCalculator.java
 */

package dsaLab.recursion;

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        // class for calculate the gcd of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int maximum = Math.max(firstNumber, secondNumber);
        int minimum = (firstNumber + secondNumber) - maximum;
        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " = " + calculateGCD(maximum, minimum));
    }

    // method to calculate the gcd used in main class
    private static int calculateGCD(int firstNumber, int secondNumber) {
        int remainder = firstNumber % secondNumber;
        if (remainder == 0) {
            return secondNumber;
        }
        return calculateGCD(secondNumber, remainder);
    }
}