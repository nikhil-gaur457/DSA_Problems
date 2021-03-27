/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 27-03-2021
 *   Time: 12:18
 *   File: SortWithoutAlgo.java
 */

package dsaSelf.Array;

import java.util.Scanner;

public class SortWithoutAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int N = scanner.nextInt();
        System.out.println("Enter the array elements (only 0, 1 and 2) : ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        int[] forZeros = new int[countZero];
        int[] forOnes = new int[countOne];
        int[] forTwos = new int[countTwo];
        for (int i = 0; i < countZero; i++) {
            forZeros[i] = 0;
        }
        for (int i = 0; i < countOne; i++) {
            forOnes[i] = 1;
        }
        for (int i = 0; i < countTwo; i++) {
            forTwos[i] = 2;
        }

        int sizeOfResult = countZero + countOne + countTwo;
        int[] result = new int[sizeOfResult];

        for (int i = 0; i < countZero; i++) {
            result[i] = forZeros[i];
        }
        for (int i = 0; i < countOne; i++) {
            result[forZeros.length + i] = forOnes[i];
        }
        for (int i = 0; i < countTwo; i++) {
            result[forZeros.length + forOnes.length + i] = forTwos[i];
        }

        for (int j : result) {
            System.out.println(j);
        }
    }
}