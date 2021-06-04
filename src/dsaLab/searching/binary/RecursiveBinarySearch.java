/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 01:43
 *   File: RecursiveBinarySearch.java
 */

package dsaLab.searching.binary;

public class RecursiveBinarySearch {
    int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - 1) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        RecursiveBinarySearch obj = new RecursiveBinarySearch();
        int[] arr = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = obj.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}