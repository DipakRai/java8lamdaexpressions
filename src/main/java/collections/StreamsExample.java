package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 65), new Person("P.G.", "Wodehouse", 100),
				new Person("William", "Darlymple", 56), new Person("Ruskin", "Bond", 75),
				new Person("Charlotte", "Bronte", 45), new Person("Charles", "Dickens", 65),
				new Person("Leo", "Tolstoy", 95));
		
		people.stream() // a new view of a collection: source is the list of people here
				.filter(person -> person.getLastName().startsWith("D")) // 2nd part: operations to be performed on the
																		// stream
				.forEach(person -> System.out.println(person.getFirstName())); // end operation concludes the 3
																				// different operations of a stream

		//Stream<Person> stream = people.stream(); //nothing happens just by declaration
		
		long count = people.parallelStream() // this allows the collection to be handled for different portions in
												// different way thereby bringing in parallel processing in a multicore
												// environment
		.filter(person->person.getLastName().startsWith("T"))
		.count();
	
		System.out.println(count);
	}

	
	
}
