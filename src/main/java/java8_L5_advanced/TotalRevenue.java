package java8_L5_advanced;

import java.util.List;

public class TotalRevenue {

	public static void main(String[] args) {
		
		List<Employee> emp = EmployeeData.getEmployees();
		
		System.out.println(emp.stream().map(Employee::getSalary).reduce(0.0, Double::sum));
	}

}
