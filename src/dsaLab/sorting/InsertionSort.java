/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 06-06-2021
 *   Time: 00:46
 *   File: InsertionSort.java
 */

package dsaLab.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {25, 15, 29, 3, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        System.out.print("Sorted array is : ");
        insertionSort.printSortedArray(arr);
    }

    public void insertionSort(int[] arr) {
        int sizeOfArray = arr.length;
        for (int i = 1; i < sizeOfArray; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void printSortedArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}