package typeinference;

public class TypeInferenceExample {

	public static void main(String args[]) {
		StringLengthLambda myLambda = s->s.length();// (s) no bracket required for single parameter
		//System.out.println(myLambda.getLength("Hello World String..")); old Java 7 way
		printLambda(myLambda);
	}

public static void printLambda(StringLengthLambda l){
	System.out.println(l.getLength("Hello Lambda static method.."));
}

}

interface StringLengthLambda {
	int getLength(String s);
}