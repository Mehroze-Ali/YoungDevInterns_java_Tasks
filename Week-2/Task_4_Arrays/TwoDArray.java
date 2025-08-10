package task4_arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Order of matrix (A x B)");

        System.out.print("A: ");
        int A = sc.nextInt();

        System.out.print("B: ");
        int B = sc.nextInt();

        int[][] matrix = new int[A][B];

        System.out.println("Enter numbers for " + A + " x " + B + " matrix:");
        for(int i=0; i<A; i++) {
            for(int j=0; j<B; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int i=0; i<A; i++) {
            for(int j=0; j<B; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
