package java8_lambdas_streams.basics.examplelambdas;
import java.util.concurrent.Callable;

import java8_lambdas_streams.domain.Trade;
public class Callables {
	
	Callable <Trade> callable = ( ) -> new Trade("GOOG", 2000, "OPEN");
	
	Callable <Trade> blockCallable = ( ) -> {
	Trade t = new Trade("GOOG", 2000, "OPEN");
	System.out.println("Creating a new Trade..");
//	encrypt(t);
//	notify();
//	persist(t);
	return t;
	};
	public static void main(String[] args) {
		Callables client = new Callables();
	}
}
