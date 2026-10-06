package java8_L3_beginner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecendingSortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 1, 9, 3, 7);
		List<Integer> dessortList = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(dessortList);

	}

}
