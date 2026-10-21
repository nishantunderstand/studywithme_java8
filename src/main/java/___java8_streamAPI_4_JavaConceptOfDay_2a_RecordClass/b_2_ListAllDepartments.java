package ___java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/


class b_2_ListAllDepartments {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );

        empList.stream()
                .map(Employee::department)
        .forEach(System.out::println);

        System.out.println("====== Saturday, September 12, 2026 6:15:54 PM ======");

        empList.stream()
                .map(Employee::department)
                .distinct()
                .forEach(System.out::println);

        System.out.println("====== Saturday, September 12, 2026 6:16:31 PM ======");

//        empList.stream()
//                .map(Employee::department)
//                .sorted(Comparator.comparingValue(Employee::yearOfJoining)) // WRONG
//                .forEach(System.out::println);


//
//                empList.stream()
//                .map(Employee::department)
//                .sorted(Comparator.comparing(Employee::yearOfJoining)) // WRONG
//                .forEach(System.out::println) 🤔🤔🤔


        System.out.println("====== Saturday, September 12, 2026 7:44:56 PM ======");
        empList.stream()
                .sorted(Comparator.comparing(Employee::id).reversed())
                .forEach(System.out::println);



        empList.stream()
                .sorted(Comparator.comparing(Employee::id).reversed())
                .map(Employee::yearOfJoining) // Why Order Matter ??
                .forEach(System.out::println);

        System.out.println("====== Saturday, September 12, 2026 7:48:59 PM ======");
        empList.stream()
                .sorted(Comparator.comparing(Employee::id).reversed())
                .distinct()
                .map(Employee::yearOfJoining)
                .forEach(System.out::println);


        System.out.println("====== Wednesday, October 21, 2026 11:10:47 PM ======");
        // This is correct , We don' need to counting
        empList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.counting()
                        )
                )
                .forEach((k,v)->System.out.println(k+":"+v));


        System.out.println("====== Wednesday, October 21, 2026 11:13:05 PM ======");
        empList.stream()
                .collect(
                        Collectors.groupingBy(Employee::department)
                )
                .forEach((k,v)->System.out.println(k));


    }
}


