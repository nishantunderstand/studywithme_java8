package java8_L5_advanced;

import java.util.*;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("Aman", "IT", 70000),
            new Employee("Ria", "IT", 80000),
            new Employee("Vivek", "HR", 60000),
            new Employee("Priya", "Finance", 75000),
            new Employee("Karan", "Finance", 65000),
            new Employee("Neha", "HR", 90000),
            new Employee("Arjun", "IT", 95000)
        );
    }
}
