package task4_arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] marks = {88, 92, 76, 81, 95};
        
        int max = marks[0];
        int min = marks[0];

        for (int mark : marks) {
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }

        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);
    }
}
