/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-03-2021
 *   Time: 08:52
 *   File: CircularQueueMain.java
 */

package dsaLab.queue.circularQueue;

import java.util.Scanner;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        while(true)
        {

            System.out.print("\n Press 1 For Insert");
            System.out.print("\n Press 2 For delete");
            System.out.print("\n Press 3 For traverse");
            System.out.print("\n Press 4 For exit");
            System.out.print("\n Press 5 For Last Elements");
            System.out.print("\n Press 6 For First Element");
            System.out.print("\n Enter Your Choice");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();

            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}