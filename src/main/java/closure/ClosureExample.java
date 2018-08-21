package closure;

public class ClosureExample {

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, new Process() {

			@Override
			public void process(int i) {
				System.out.println(i + b);

			}

		});

	}
}

	interface Process(){
		void process(int i);
	}
}
