package java8_lambdas_streams.functions.predicate;

import java.util.function.Predicate;

// java.util.function.Predicate functional interface
public class PredicateFunction {

	Predicate<Employee> bonusLambda = (emp)-> emp.getRatings()>10?true:false;
	Predicate<Employee> execLambda = emp -> emp.getId().startsWith("E99")?true:false;
	
	Predicate<String> emptyString = s -> s.isEmpty();
	
	public static void main(String[] args) {
	}

}
