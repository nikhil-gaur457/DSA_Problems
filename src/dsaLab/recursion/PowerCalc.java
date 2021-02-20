/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-02-2021
 *   Time: 12:10
 *   File: PowerCalc.java
 */

package dsaLab.recursion;

import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        // class to print the value exponential function
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent value : ");
        int exponent = scanner.nextInt();
        scanner.close();
        if (base < 0 || exponent < 0) {
            System.err.println("The base and the exponent must be positive!");
        } else {
            System.out.println(base + "^" + exponent + " = " + calculatePower(base, exponent));
        }
    }

    // method to calculate the exponent function used in main class
    private static int calculatePower(int base, int exponent) {
        if (exponent != 0) {
            return (base * calculatePower(base, exponent - 1));
        } else {
            return 1;
        }
    }
}