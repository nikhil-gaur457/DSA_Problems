/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 06-06-2021
 *   Time: 00:51
 *   File: QuickSort.java
 */

package dsaLab.sorting;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {45, 12, 16, 18, 2, 8};
        int sizeOfArray = arr.length;
        quickSort.quickSort(arr, 0, sizeOfArray - 1);
        System.out.print("Sorted array is : ");
        quickSort.printSortedArray(arr);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int breakingArray(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = breakingArray(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public void printSortedArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}