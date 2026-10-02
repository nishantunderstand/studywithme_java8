package _java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
 * Java 8 Interview Sample Coding Questions </a>
 */
record Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
}

class a_1_CountMaleAndFemaleEmployees {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );
        empList.stream().forEach(System.out::println);

        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::gender,
                        Collectors.counting()
                )));

        Map<String,Long> result = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::gender,
                        Collectors.counting()
                ));

        for(Map.Entry<String,Long> entry : result.entrySet()){
            System.out.println(entry.getKey()+ " -> "+  entry.getValue());
        }

        System.out.println("====== Saturday, September 12, 2026 5:28:51 PM ======");
        empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::gender,
                        Collectors.counting()
                )).forEach((k,v)->System.out.println(k+"->"+v));

    }
}