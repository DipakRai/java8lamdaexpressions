package lambdaexpinterfaceimpl;

import lambdaexpinterface.Greeting;

/**
 * With lambdas Java compiler does a type inference
 * @author mulshankar13
 *
 */
public class Greeter {
	
	public void greet (Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String args[]) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		MyLambda myLambdaFunction = ()->System.out.println(" Hello World Lambda foo...");
		myLambdaFunction.foo();
		/**
		 * If you are using an interface to create a lambda expression then the interface must have only one 
		 * method. 
		 */
		Greeting myLambdaFunction2 = () -> System.out.println(" Hello World Lambda Greeting...");// it only matters that the
																						// signature as the interface
		myLambdaFunction2.perform();
	
		MyAdd addFunction = (int a, int b)->a+b;
		System.out.println("addfunction add result ="+addFunction.add(2, 4));
	}
	
	
	// create an interface to use lambda function in java 8
	interface MyLambda {
		void foo();
	}
	
	interface MyAdd {
		int add(int x, int y);
	}

}
