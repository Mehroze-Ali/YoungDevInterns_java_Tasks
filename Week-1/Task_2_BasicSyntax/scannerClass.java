package task2_syntax;

import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in feet: ");
        float height = sc.nextFloat();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Is Java fun? (true/false): ");
        boolean isJavaFun = sc.nextBoolean();

        System.out.println("\n--- Your Details ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

        sc.close();

    }
}
