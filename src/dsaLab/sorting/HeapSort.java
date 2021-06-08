/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-06-2021
 *   Time: 22:01
 *   File: HeapSort.java
 */

package dsaLab.sorting;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {23, 9, 45, 6, 7, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        System.out.print("Sorted array is : ");
        heapSort.printHeapArray(arr);
    }

    private void arrangeHeap(int[] arr, int sizeOfArray, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < sizeOfArray && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < sizeOfArray && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            arrangeHeap(arr, sizeOfArray, largest);
        }
    }

    public void heapSort(int[] arr) {
        int sizeOfArray = arr.length;
        for (int i = sizeOfArray / 2 - 1; i >= 0; i--) {
            arrangeHeap(arr, sizeOfArray, i);
        }
        for (int i = sizeOfArray - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            arrangeHeap(arr, i, 0);
        }
    }

    public void printHeapArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}