package java8_L4_beforeadv;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStats {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
		
		IntSummaryStatistics stats = nums.stream().mapToInt(Integer::intValue).summaryStatistics();
		//DoubleSummaryStatistics stats = nums.stream().mapToDouble(Integer::intValue).summaryStatistics();
		
		System.out.println(stats);






	}

}
