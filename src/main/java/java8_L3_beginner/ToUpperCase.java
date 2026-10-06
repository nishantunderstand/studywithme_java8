package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "spring", "boot");
		
		//List<String> stringList = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());

        List<String> stringList =
                list.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());


        System.out.println(stringList);

        System.out.println("====== Tuesday, October 6, 2026 10:39:57 PM ======");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
		

	}

}
