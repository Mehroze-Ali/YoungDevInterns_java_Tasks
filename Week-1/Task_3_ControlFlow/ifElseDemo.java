package task3_flowcontrol;

import java.util.Scanner;

public class ifElseDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks between 0-100: ");
        int marks = sc.nextInt();

        if (marks < 100) {
            if (marks >= 50) {
                System.out.println("Pass!");
            } else if (marks < 50) {
                System.out.println("Fail!");
            } else {
                System.out.println("invalid input.");
            }
        } else {
            System.out.println("Marks out of bounds");
        }

        sc.close();
    }
}
