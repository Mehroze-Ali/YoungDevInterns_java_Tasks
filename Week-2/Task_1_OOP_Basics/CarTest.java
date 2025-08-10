package task1_oop_basics;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.model = "M5 - CS";
        car.year = 2020;

        System.out.println("Car details: ");
        car.displayInfo();
    }
}

