package java8_L4_beforeadv;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name; int age; double salary;
    Employee(String n, int a, double s){name=n;age=a;salary=s;}
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    
    public String toString(){return name + "(" + age + ", " + salary + ")";}
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Ria", 25, 90000),
            new Employee("Aman", 28, 60000),
            new Employee("Vivek", 30, 55000)
        );

        list.stream()
            .sorted(Comparator.comparing(Employee::getSalary)
                              .thenComparing(Employee::getName))
            .forEach(System.out::println);


        System.out.println("====== Tuesday, October 6, 2026 10:40:58 PM ======");

        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName)
                        .reversed()
                )
                .forEach(System.out::println);

        System.out.println("======  Maximium Salary ======");
        list.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("====== Finding Maximium Salary ======");

        // Using max()
        list.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        // Using Collectors.maxBy()
        list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .ifPresent(System.out::println);


    }
}
