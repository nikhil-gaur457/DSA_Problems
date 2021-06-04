/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 01:04
 *   File: LinearSearch.java
 */

package dsaLab.searching.sequential;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 3, 4, 10, 40};
        System.out.println("Enter the element to search : ");
        int x = scanner.nextInt();
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element is not present at index");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}