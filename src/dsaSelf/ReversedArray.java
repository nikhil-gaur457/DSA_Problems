/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-02-2021
 *   Time: 22:27
 *   File: ReversedArray.java
 */

package dsaSelf;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int start = 0;
        int end = N-1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array : ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}