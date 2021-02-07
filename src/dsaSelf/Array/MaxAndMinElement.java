/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-02-2021
 *   Time: 22:47
 *   File: MaxAndMinElement.java
 */

package dsaSelf.Array;

import java.util.Scanner;

public class MaxAndMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int sizeOfArray= scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < sizeOfArray; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        System.out.println("minimum element of array is '" + min +"'");
        System.out.println("maximum element of array is '" + max + "'");
    }
}