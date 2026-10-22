package ___java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class i_9_MostExperiencedEmployee {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(1, "Anmanika Jee", 30, "F", "Finance", 1990, 80000)
        );


        // Based On Id
        // Based on Year Of Joining

        System.out.println("====== Based On Id  ======");
        empList.stream()
                .min(Comparator.comparingInt(Employee::id))
                .ifPresent(System.out::println);


        System.out.println("====== Thursday, October 22, 2026 1:07:44 AM ======");
        System.out.println("====== Based On Year Of Joining  ======");
        empList.stream()
                .min(Comparator.comparingInt(Employee::yearOfJoining))
                .ifPresent(System.out::println);


    }
}
