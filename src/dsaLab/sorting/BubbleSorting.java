/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 23:32
 *   File: BubbleSorting.java
 */

package dsaLab.sorting;

public class BubbleSorting {
    public void bubbleSort(int[] arr, int lengthOfArray) {
        boolean done = false;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            for (int j = 0; j < lengthOfArray - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    done = true;
                }
            }
            if (!done) {
                break;
            }
        }
    }

    public void printSortedArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}