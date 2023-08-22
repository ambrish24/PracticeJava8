package java8_lambdas_streams.basics;

@FunctionalInterface
public interface FunctionaInterface {
	public void click();
	
	// enable this method will make compiler unhappy
//	public void unclick();
	
	default public boolean isClickable(){
		return false;
	}
}
