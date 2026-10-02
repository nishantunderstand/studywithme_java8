package java8_streamAPI_MethodReference;

import java.util.*;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. ClassName::staticMethod
        // --------------------------------------------------

        List<String> numbers = Arrays.asList("10", "20", "30");

        List<Integer> result1 = numbers.stream()
                .map(Integer::parseInt)
                .toList();

        System.out.println(result1);


        // --------------------------------------------------
        // 2. ClassName::instanceMethod
        // --------------------------------------------------

        List<String> names = Arrays.asList("Java", "Spring", "Java");

        long count = names.stream()
                .filter("Java"::equals)
                .count();

        System.out.println(count);


        // --------------------------------------------------
        // 3. object::instanceMethod
        // --------------------------------------------------

        String prefix = "Java";

        List<String> words = Arrays.asList("Java", "Spring", "Java");

        boolean exists = words.stream()
                .anyMatch(prefix::equals);

        System.out.println(exists);


        // --------------------------------------------------
        // 4. ClassName::new
        // --------------------------------------------------

        List<String> input = Arrays.asList("A", "B", "C");

        List<StringBuilder> builders = input.stream()
                .map(StringBuilder::new)
                .toList();

        System.out.println(builders);
    }
}