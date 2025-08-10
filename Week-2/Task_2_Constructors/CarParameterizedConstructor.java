package task2_constructors;

public class CarParameterizedConstructor {
    String owner;
    String brand;
    int year;

    // Parameterized constructor
    public CarParameterizedConstructor(String owner, String brand, int year) {
        this.owner = owner;
        this.brand = brand;
        this.year = year;
    }

    public void displayCar() {
        System.out.println(owner + "'s car: " + brand + " (" + year + ")");
    }

    public static void main(String[] args) {
        CarParameterizedConstructor mehrozCar = new CarParameterizedConstructor("Mehroz", "Honda", 2021);
        CarParameterizedConstructor friendCar = new CarParameterizedConstructor("Haseeb", "Kia", 2023);

        mehrozCar.displayCar();
        friendCar.displayCar();
    }
}
