package java8_L5_advanced;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class SummaryStats {

	public static void main(String[] args) {
		
		List<Employee> emp = EmployeeData.getEmployees();
		
		DoubleSummaryStatistics stats = emp.stream().mapToDouble(Employee::getSalary).summaryStatistics();
		
		System.out.println(stats);

	}

}
