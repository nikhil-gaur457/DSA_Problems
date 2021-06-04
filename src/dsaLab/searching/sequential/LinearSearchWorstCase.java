/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-06-2021
 *   Time: 01:20
 *   File: LinearSearchWorstCase.java
 */

package dsaLab.searching.sequential;

public class LinearSearchWorstCase {
    public static void search(int[] arr, int x) {
        int length = arr.length;
        int left = 0;
        int right = length - 1;
        int position = -1;
        for (left = 0; left <= right; ) {
            if (arr[left] == x) {
                position = left;
                System.out.println("Element found at " + (position + 1) + " position");
                break;
            }
            if (arr[right] == x) {
                position = right;
                System.out.println("Element found at " + (position + 1) + " position");
                break;
            }
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        search(arr, x);
    }
}