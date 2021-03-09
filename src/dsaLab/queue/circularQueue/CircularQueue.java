/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-03-2021
 *   Time: 08:51
 *   File: CircularQueue.java
 */

package dsaLab.queue.circularQueue;

import java.util.Scanner;

public class CircularQueue {
    int ar[];
    int Front;
    int Rear;

    CircularQueue() {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }

    void insert() {
        if ((Front == 0 && Rear == 4) || Rear == Front - 1) {
            System.out.println("Circular queue full");

        } else {
            System.out.println("Enter data ");
            Scanner scanner = new Scanner(System.in);
            int data = scanner.nextInt();

            if (Front == -1) {
                Front = 0;
            }
            if (Rear < 4) {
                Rear = Rear + 1;
            } else if (Rear == 4 && Front != 0) {
                Rear = 0;
            }
            ar[Rear] = data;
            System.out.println("data inserted...");
        }
    }

    void delete() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Circular queue emepty");
        } else {
            if (Front == Rear) {
                System.out.println("deleted :" + ar[Front]);
                Front = -1;
                Rear = -1;

            } else if (Front < Rear) {
                System.out.println("deleted :" + ar[Front]);
                Front = Front + 1;
            } else if (Front == 4) {
                System.out.println("deleted :" + ar[Front]);
                Front = 0;
            } else if (Rear < Front) {
                System.out.println("deleted :" + ar[Front]);
                Front = Front + 1;
            }
        }
    }

    void traverse() {
        if (Front == -1 || Rear == -1) {
            System.out.println("Circular Queue Empty");
        } else {
            if (Front <= Rear) {
                for (int i = Front; i <= Rear; i++) {
                    System.out.println(" " + ar[i]);
                }
            } else {
                for (int i = Front; i <= 4; i++) {
                    System.out.println(" " + ar[i]);
                }
                for (int i = 0; i <= Rear; i++) {
                    System.out.println(" " + ar[i]);
                }
            }
        }
    }
}