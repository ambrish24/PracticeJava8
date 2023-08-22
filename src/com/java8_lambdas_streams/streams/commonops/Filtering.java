package java8_lambdas_streams.streams.commonops;
import java.util.List;
import java.util.stream.Stream;

import java8_lambdas_streams.domain.Employee;
import java8_lambdas_streams.util.EmployeeUtil;

//Filtering operation
public class Filtering {
	List<Employee> employees = EmployeeUtil.createEmployees();
	
	private void testFiltering() {
		Stream<Employee> empStream = employees
				.stream()
				.filter(Employee::isSenior)
				.filter(e -> e.getDepartment().equals("Marketing"))
				.filter(Employee::isExecutive);
		empStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		new Filtering().testFiltering();
	}

}
