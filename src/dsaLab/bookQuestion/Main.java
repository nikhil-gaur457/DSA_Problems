/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-03-2021
 *   Time: 18:44
 *   File: Main.java
 */

package dsaLab.bookQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookQueue queueObj = new BookQueue(3);
        BookContaing book;

        for (int i = 0; i < 3; i++) {
            book = new BookContaing();
            System.out.print("Enter price of Book " + (i+1) + ": ");
            book.setPrice(scanner.nextInt());
            System.out.print("Enter name of Book " + (i+1) + ": ");
            scanner.nextLine();
            book.setBookName(scanner.nextLine());
            queueObj.enqueue(book);
        }
        for (int i = 0; i < 3; i++) {
            queueObj.print();
        }

    }
}