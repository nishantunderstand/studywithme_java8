package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartwith {

	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
		
		List<String> stringList = list.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(stringList);
	}
}
