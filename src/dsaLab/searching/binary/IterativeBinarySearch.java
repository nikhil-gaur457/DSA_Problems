/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 02:01
 *   File: IterativeBinarySearch.java
 */

package dsaLab.searching.binary;

public class IterativeBinarySearch {
    int binarySearch(int arr[], int x) {
        int l = 0;
        int r = arr.length-1;
        while (l <= r) {
            int m = l+ (r-1)/2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeBinarySearch ibs = new IterativeBinarySearch();
        int[] arr = {2,3,4,10,40};
        int n= arr.length;
        int x = 10;
        int result = ibs.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}