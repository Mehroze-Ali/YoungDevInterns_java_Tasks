package week3_inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Ali", 50000);
        Employee mgr = new Manager("Sara", 80000, "IT"); // dynamic dispatch

        emp.displayInfo();
        emp.work();

        mgr.displayInfo();
        mgr.work(); // calls Manager’s overridden method
    }
}