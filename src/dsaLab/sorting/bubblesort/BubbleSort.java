/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 23:28
 *   File: BubbleSort.java
 */

package dsaLab.sorting.bubblesort;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int lengthOfArray = arr.length;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            for (int j = 0; j < lengthOfArray - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printSortedArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}