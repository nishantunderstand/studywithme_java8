package java8_L5_advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GrouupByFirstLetter {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "ant", "banana", "berry", "boat");
		
		System.out.println(list.stream().collect(Collectors.groupingBy(s -> s.substring(0,1))));

	}

}
