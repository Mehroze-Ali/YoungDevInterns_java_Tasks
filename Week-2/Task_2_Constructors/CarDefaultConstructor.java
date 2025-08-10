package task2_constructors;

public class CarDefaultConstructor {
    String owner;
    String brand;
    int year;

    // Default constructor
    public CarDefaultConstructor() {
        owner = "Mehroz";
        brand = "BMW";
        year = 2022;
    }

    public void displayCar() {
        System.out.println(owner + "'s car: " + brand + " (" + year + ")");
    }

    public static void main(String[] args) {
        CarDefaultConstructor car = new CarDefaultConstructor();
        car.displayCar();
    }
}