package week3_inheritance;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working...");
    }
}
