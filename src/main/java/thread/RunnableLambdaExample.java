package thread;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {//boilerplate code
			@Override
			public void run() {
				System.out.println(" Printed inside runnable...");

			}
		});

		myThread.run();
		
		Thread myLambdaThread = new Thread (()->System.out.println(" Printed inside Lambda runnable..."));
		myLambdaThread.run();
	}
}