package java8_L5_advanced;

public class Employee {

    private final String name;
    private final String dept;
    private final double salary;

    // Constructor
    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    // For pretty printing in stream outputs
    @Override
    public String toString() {
        return name + " (" + dept + ", " + salary + ")";
    }
}
