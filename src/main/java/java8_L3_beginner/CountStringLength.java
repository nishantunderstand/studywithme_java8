package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;

public class CountStringLength {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Airtel", "Sun", "Planet", "Sky", "Internet");

		Long res = list.stream().filter(n -> n.length() > 5).count();
				//.collect(Collectors.counting());
		
		System.out.println(res);
	}
}
