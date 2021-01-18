package dsaLab;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val;
        while (true) {
            System.out.println("Choose the action : ");
            System.out.println("Enter 1 for Hello");
            System.out.println("Enter 2 for Bye");
            System.out.println("Enter 3 for Lunch");
            System.out.println("Enter 4 for Exit");
            val = scanner.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Bye");
                    break;
                case 3:
                    System.out.println("Lunch");
                    break;
                case 4 :
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter the valid value between 1 to 4");
                    break;
            }
        }
    }
}
