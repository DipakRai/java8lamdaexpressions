package unit1exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

import collections.Person;

/**
 * @author dipakrai
 * 
 *         Java 8 solution to the problem
 *
 */
public class Unit1ExerciseJava8Solution {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 65), new Person("P.G.", "Wodehouse", 100),
				new Person("William", "Darlymple", 56), new Person("Ruskin", "Bond", 75),
				new Person("Charlotte", "Bronte", 45), new Person("Charles", "Dickens", 65),
				new Person("Leo", "Tolstoy", 95));

		// Step 1 : Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("Prints all elements in the list...");

		// Step 2 : Create a method that prints all elements in the list
		printConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("Prints all elements in the list with last name beginning with D...");

		// Step 3: Create a method that prints all people that have last name beginning
		// with D
		printConditionally(people, p -> p.getLastName().toLowerCase().startsWith("d"),
				p -> System.out.println(p.getLastName()));

		// Step 4: Create a method that prints all people that have last name beginning
		// with D
		System.out.println("Prints all elements in the list with first name beginning with C...");
		printConditionally(people, p -> p.getFirstName().toLowerCase().startsWith("c"),
				p -> System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		// with Consumer you are passing a behaviour , any behaviour, i.e. to print the
		// first name or the last name without writing any extra code
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
