/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-02-2021
 *   Time: 16:18
 *   File: FibonacciSeries.java
 */

package dsaLab.recursion;

import java.util.Scanner;

public class FibonacciSeries {
    // Execution method of fibonacci Series
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series : ");
        int numberOfTerms = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(fibonacciTerms(i) + ((i < numberOfTerms - 1) ? ", " : "."));
        }
    }
    // Method to calculate the terms of series
    private static int fibonacciTerms(int index) {
        // As Series starts from 0, 1, 1,...
        if (index == 0) {
            // So for index 0 it will print 0
            return 0;
        }
        if (index == 1 || index == 2) {
            // For index 1 and 2, print 1
            return 1;
        }
        // For other indexes give value as sum of previous two terms.
        return (fibonacciTerms(index - 1) + fibonacciTerms(index - 2));
    }
}