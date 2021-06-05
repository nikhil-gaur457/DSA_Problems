/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 23:32
 *   File: BubbleSortingMain.java
 */

package dsaLab.sorting.bubblesort;

public class BubbleSortingMain {
    public static void main(String[] args) {
        BubbleSorting bubbleSorting = new BubbleSorting();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int sizeOfArray = arr.length;
        bubbleSorting.bubbleSort(arr, sizeOfArray);
        System.out.print("Sorted array : ");
        bubbleSorting.printSortedArray(arr);
    }
}