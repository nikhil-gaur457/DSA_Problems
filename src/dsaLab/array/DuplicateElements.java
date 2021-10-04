/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 24-06-2021
 *   Time: 20:12
 *   File: DuplicateElements.java
 */

package dsaLab.array;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 8, 1, 9, 2, 3, 8, 6, 9, 1};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}