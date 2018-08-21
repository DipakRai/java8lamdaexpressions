package lambdaexceptionhandling;

import java.util.function.BiConsumer;

/**
 * 
 * @author dipakrai
 * Java 8 way of printing sum of numbers based on a key
 *
 */
public class ExcHandlingExJava8 {
	
	public static void main(String[] args) {
		
		int [] someNumbers = {1,2,3,4};
		int key=2;
		// v,k is made out by the compiler as to what datatype it refers to by reading the
		// the process method signature 
		process(someNumbers,key,(v,k)->System.out.println(v+k));
	}
	
	private static void process (int []someNumbers,int key,BiConsumer<Integer,Integer>consumer) {
		for(int i:someNumbers) {
			consumer.accept(i, key);
		}
	}

}
