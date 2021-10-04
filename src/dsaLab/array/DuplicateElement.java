/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 24-06-2021
 *   Time: 20:49
 *   File: DuplicateElement.java
 */

package dsaLab.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 1, 9, 2, 3, 8, 6, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            int modOfArray = arr[i] % arr.length;
            arr[modOfArray] = arr[modOfArray] + arr.length;
        }
        System.out.println("The duplicate elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}