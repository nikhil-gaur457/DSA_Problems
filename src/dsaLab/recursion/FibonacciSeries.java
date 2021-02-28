/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-02-2021
 *   Time: 16:18
 *   File: FibonacciSeries.java
 */

package dsaLab.recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series : ");
        int numberOfTerms = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(fibonacciTerms(i) + ((i < numberOfTerms - 1) ? ", " : "."));
        }
    }

    private static int fibonacciTerms(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return (fibonacciTerms(i - 1) + fibonacciTerms(i - 2));
    }
}