package _java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class f_6_CountEmployeesByDepartment {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );

        Map<String,Long> count = empList.stream().collect(Collectors.groupingBy(
                Employee::department,
                Collectors.counting()
        ));

        System.out.println(count);
        System.out.println("====== Friday, October 2, 2026 3:30:41 PM ======");

        empList.stream().collect(Collectors.groupingBy(
                Employee::department,
                Collectors.counting()
        )).forEach((k,v)-> System.out.println(k+"->"+v));

    }
}
