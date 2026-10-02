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
class c_3_AverageAgeByGender {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );

        empList.stream().collect(Collectors.groupingBy(
                Employee::gender,
                Collectors.averagingInt(Employee::age)
        )).forEach((k,v)-> System.out.println(k+"->"+v));

    }
}

/**

| Collector           | Return type |
        | ------------------- | ----------- |
        | `averagingInt()`    | **Double**  |
        | `averagingLong()`   | **Double**  |
        | `averagingDouble()` | **Double**  |
        | `summingInt()`      | **Integer** |
        | `summingLong()`     | **Long**    |
        | `counting()`        | **Long**    |

 */