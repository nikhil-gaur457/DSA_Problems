/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 17-12-2021
 *   Time: 01:25
 *   File: ActivitySelection.java
 */

package dsaLab.greedy;

public class ActivitySelection {
    public static void printMaxActivities(int[] start, int[] finish, int numberOfActivities) {
        int i = 0;
        int j;
        System.out.print("Following activities are selected : ");
        System.out.print(i + " ");
        for (j = 1; j < numberOfActivities; j++) {
            if (start[j] >= finish[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 4, 7, 8, 9, 9, 11, 12};
        int[] finish = {3, 5, 4, 7, 10, 9, 11, 13, 12, 14};
        int n = start.length;
        printMaxActivities(start, finish, n);
    }
}
