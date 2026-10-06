package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;

public class sumOfEven {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		long sum = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToLong(Integer::intValue)
                .sum();


		System.out.println(sum);

        System.out.println("====== Tuesday, October 6, 2026 10:38:13 PM ======");
        list.stream().filter(n->n%2==0)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
		
	}
}
