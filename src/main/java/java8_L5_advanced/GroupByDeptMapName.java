package java8_L5_advanced;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByDeptMapName {

	public static void main(String[] args) {
		
		List<Employee> emp = EmployeeData.getEmployees();
		System.out.println(emp.stream().collect(Collectors
				.groupingBy(Employee::getDept, Collectors
						.mapping(Employee::getName, Collectors
								.toList()))));

	}

}
