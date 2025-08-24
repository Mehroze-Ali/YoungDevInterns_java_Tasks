package week3_inheritance;

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

