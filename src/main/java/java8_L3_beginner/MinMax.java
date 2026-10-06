package java8_L3_beginner;

import java.util.Arrays;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 5, 22, 8, 3);
		
		int max = list.stream().max(Integer::compareTo).get();
		int min = list.stream().min(Integer::compareTo).get();

//		System.out.print("Max = "+list.stream().max(Integer::compareTo).hashCode()
//				+", Min = "+list.stream().min(Integer::compareTo).hashCode());

        System.out.print("Max = "+max
				+", Min = "+min);
	}

}
