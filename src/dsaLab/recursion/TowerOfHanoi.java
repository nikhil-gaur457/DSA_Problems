/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-02-2021
 *   Time: 21:12
 *   File: TowerOfHanoi.java
 */

package dsaLab.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        // Execution class for Tower of Hanoi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks on source tower : ");
        int numberOfDisks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter three characters for Tower of Hanoi : ");
        char firstTowerName = scanner.nextLine().trim().charAt(0);
        char secondTowerName = scanner.nextLine().trim().charAt(0);
        char thirdTowerName = scanner.nextLine().trim().charAt(0);
        scanner.close();
        System.out.println("Follow these steps to solve Tower of Hanoi --->> ");
        showSteps(numberOfDisks, firstTowerName, secondTowerName, thirdTowerName);
    }
    // Method to solve the Tower Of Hanoi
    private static void showSteps(int numberOfDisks, char source, char via, char destination) {
        if (numberOfDisks == 1) {
            System.out.println("Move the top disk from the tower '" + source + "' to tower '" + destination + "'.");
            return;
        }
        showSteps(numberOfDisks-1, source, destination, via);
        System.out.println("Move the top disk from the tower '" + source + "' to tower '" + destination + "'.");
        showSteps(numberOfDisks-1, via, source, destination);
    }
}