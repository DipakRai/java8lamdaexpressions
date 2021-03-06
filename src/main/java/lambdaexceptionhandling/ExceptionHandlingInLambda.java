package lambdaexceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {

		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;
		// v,k is made out by the compiler as to what datatype it refers to by reading
		// the process method signature
		process(someNumbers, key, (v, k) -> {
			try {
				System.out.println(v / k);
			} catch (ArithmeticException e) {
				System.out.println("An Arithmetic Exception occurred...");
			}
		});
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

}
