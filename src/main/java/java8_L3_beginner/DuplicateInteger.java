package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;

public class DuplicateInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
		List<Integer> listIntegers = list.stream().distinct().toList();
		System.out.println(listIntegers);
	}

}
