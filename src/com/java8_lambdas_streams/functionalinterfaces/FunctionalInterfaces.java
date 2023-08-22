package java8_lambdas_streams.functionalinterfaces;

import java.util.List;

//@FunctionalInterface
interface Component {
	// one and only one abstract method
	public String find(String componentName);

	public List<String> findAll();

	default public String getName() {
		return "Default Name";
	}
}

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
