package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListToStringList{

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30);
		
		List<String> stringlist = list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(stringlist);
	}
}
