package java8_lambdas_streams.functions.supplier;

import java.util.List;
import java.util.function.Supplier;

import java8_lambdas_streams.domain.Trade;
import java8_lambdas_streams.util.TradeUtil;

/* Supplier Functional Interface */

public class SupplierFunctionalInterface {
	Supplier<String[]> fruitSupplier = () -> new String[]{"Apple", "Orange"};

	Supplier<List<Trade>> tradeSupplier = () -> TradeUtil.createTrades();
	private void testSupplier() {
		String[] fruits = fruitSupplier.get();
		for(String fruit: fruits){
			System.out.println("Fruit is: "+fruit);
		}
		
		List<Trade> trades = tradeSupplier.get();
		for(Trade trade: trades){
			System.out.println("Trade is: "+trade);
		}
		
	}
	public static void main(String[] args) {
		new SupplierFunctionalInterface().testSupplier();
	}

}
