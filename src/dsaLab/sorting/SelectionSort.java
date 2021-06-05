/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 06-06-2021
 *   Time: 00:27
 *   File: SelectionSort.java
 */

package dsaLab.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {12, 52, 41, 78, 21, 10, 75};
        selectionSort.selectionSort(arr);
        System.out.print("Sorted array is : ");
        selectionSort.printSortedArray(arr);
    }

    public void selectionSort(int[] arr) {
        int sizeOfArray = arr.length;
        for (int i = 0; i < sizeOfArray - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < sizeOfArray; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void printSortedArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}