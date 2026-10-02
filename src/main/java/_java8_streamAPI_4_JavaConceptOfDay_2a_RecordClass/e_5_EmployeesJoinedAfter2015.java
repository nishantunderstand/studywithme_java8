package _java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class e_5_EmployeesJoinedAfter2015 {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2010, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2013, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );
        System.out.println("====== Printing Approach  ======");
        empList.stream()
                .filter(n -> n.yearOfJoining() > 2015) //<--
                .forEach(System.out::println);


        List<Employee> result =
                empList.stream()
                        .filter(n -> n.yearOfJoining()> 2015)
                        .collect(Collectors.toList());
        System.out.println("====== Friday, October 2, 2026 3:24:35 PM ======");
        System.out.println(result);


        System.out.println("====== Java 16 Approach  ======");
        List<Employee> result16 =
                empList.stream()
                        .filter(n -> n.yearOfJoining()> 2015)
                        .toList();
        System.out.println(result16);



    }
}


// toList
// there is no such thing as toSet or toMap