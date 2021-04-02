/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-04-2021
 *   Time: 17:21
 *   File: AggressiveCows.java
 */

package dsaSelf.Array;

import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of test cases : ");
        int t = scanner.nextInt();
        while (t-- > 0) {
            System.out.print("Enter number of stalls : ");
            int n = scanner.nextInt();
            System.out.print("Enter number of cows : ");
            int c = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int position = max/c;
            System.out.println("maximum distance is " + position);
        }
    }
}