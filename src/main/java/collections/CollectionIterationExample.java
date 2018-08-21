package collections;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 65), new Person("P.G.", "Wodehouse", 100),
				new Person("William", "Darlymple", 56), new Person("Ruskin", "Bond", 75),
				new Person("Charlotte", "Bronte", 45), new Person("Charles", "Dickens", 65),
				new Person("Leo", "Tolstoy", 95));

		
		for (Person person : people) {// for in loop:something you still control
			System.out.println(person);
		}

		
		people.forEach(p -> System.out.println("Java 8 Lambda" + p)); // for each loop something which the java runtime
																		// controls
		
		people.forEach(System.out::println); //TODO what is the ::operator
		
	}

}
