/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 26-03-2021
 *   Time: 20:48
 *   File: KthMaxAndMin.java
 */

package dsaSelf.Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the array elements >");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the K'th smallest number of the element : ");
        int K = scanner.nextInt();
        System.out.println("K'th smallest number in the array is " + kthSmallest(arr, K));
        System.out.println("K'th largest number in the array is " + kthLargest(arr, K));
    }

    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int kthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}