package lambdaexceptionhandling;

/**
 * 
 * @author mulshankar13
 * Java 7 way of printing sum of numbers based on a key
 *
 */
public class ExceptionHandlingExampleJava7 {
	
	public static void main(String[] args) {
		
		int [] someNumbers = {1,2,3,4};
		int key=2;
		process(someNumbers,key);
	}
	
	private static void process (int []someNumbers,int key) {
		for(int i:someNumbers) {
			System.out.println(i+key);
		}
	}

}
