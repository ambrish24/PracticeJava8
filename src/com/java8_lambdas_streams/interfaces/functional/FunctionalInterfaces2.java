package java8_lambdas_streams.interfaces.functional;

public class FunctionalInterfaces2 {
	interface Factory {
		Car create(int id);
	}

	// Lambda expression
	Factory f = id ->  new Car(id);  

	public static void main(String[] args) {

	}

}
