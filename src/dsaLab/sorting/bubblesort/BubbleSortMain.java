/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 23:29
 *   File: BubbleSortMain.java
 */

package dsaLab.sorting.bubblesort;

public class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 6, 4, 2, 15, 9, 40};
        bs.bubbleSort(arr);
        System.out.print("Sorted array is : ");
        bs.printSortedArray(arr);
    }
}