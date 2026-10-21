package ___java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class h_8_YoungestMaleInProductDevelopment_IMP {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 3, "M", "IT", 2019, 80000)
        );

        empList.stream()
                .filter(e->e.gender().equals("M"))
                .filter(e->e.department().equals("IT"))
                .min(Comparator.comparingInt(Employee::age))
                .ifPresent(System.out::println);
    }
}
