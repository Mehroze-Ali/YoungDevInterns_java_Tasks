package task3_flowcontrol;

public class loopsDemo {
    public static void main(String[] args) {


        System.out.println("For Loop Output:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }


        System.out.println("While Loop Output:");

        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }


        System.out.println("Do while Loop Output:");

        int num = 1;

        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
    }
}
