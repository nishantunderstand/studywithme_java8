package java8_L5_advanced_$$$$$;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


// TODO:
public class HighestAsPerDept {

	public static void main(String[] args) {
		
		List<Employee> emp = EmployeeData.getEmployees();

		System.out.println(emp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors
		.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get))));



        System.out.println("====== Tuesday, October 6, 2026 10:56:04 PM ======");

       emp.stream()
               .collect(Collectors.groupingBy( // ?? What i get here ??
                       Employee::getDept,
                       Collectors.collectingAndThen( // ??
                               Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                               Optional::get // Why do we nned Optional::get ?? ??
                       )
               ))
               .forEach((k,v)->System.out.println(k+"->"+v));
	}

}
