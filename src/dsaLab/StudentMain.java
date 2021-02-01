package dsaLab;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of students in a class");
        int numberOfStudents = scanner.nextInt();
        int yourId = 0;
        int marks = 0;
        String studentsName = null;
        int val;
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            try {
                yourId = scanner.nextInt();
                marks = scanner.nextInt();
                scanner.nextLine();
                studentsName = scanner.nextLine();
            } catch (Exception a) {
                System.out.println("run again");
                a.printStackTrace();
            }
            Student obj = new Student(yourId, marks, studentsName);
            students[i] = obj;
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            sum += students[i].getMarks();
        }
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].toString());
        }
        float average = sum / numberOfStudents;
        System.out.println("Average of the class : " + average);
    }
}
