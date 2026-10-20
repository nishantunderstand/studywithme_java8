package java8_L5_advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Aman", "Ria", "Vivek");
		
		
		System.out.println(list.stream().collect(Collectors.joining(",","[","]")));

	}

}
