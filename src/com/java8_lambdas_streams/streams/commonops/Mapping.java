package java8_lambdas_streams.streams.commonops;
import java.util.List;
import java.util.stream.Stream;

import java8_lambdas_streams.domain.Employee;
import java8_lambdas_streams.util.EmployeeUtil;

//Mapping operation
public class Mapping {
	List<Employee> employees = EmployeeUtil.createEmployees();
	
	private void testMapping() {
		Stream<String> empStream = employees
				.stream()
				.map(Employee::getName)
				.map(String::toUpperCase);
		
		empStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		new Mapping().testMapping();
	}

}
