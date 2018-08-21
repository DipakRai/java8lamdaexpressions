package unit1exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.Person;

/**
 * @author dipakrai
 * 
 *         Java 7 solution to the problem
 *
 */
public class Unit1ExerciseJava7Solution {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 65), new Person("P.G.", "Wodehouse", 100),
				new Person("William", "Darlymple", 56), new Person("Ruskin", "Bond", 75),
				new Person("Charlotte", "Bronte", 45), new Person("Charles", "Dickens", 65),
				new Person("Leo", "Tolstoy", 95));

		// Step 1 : Sort list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("Step 2...prints all elements in the list");

		// Step 2 : Create a method that prints all elements in the list
		printAll(people);
		System.out.println("Step 3...prints all elements in the list with last name beginning with d");

		// Step 3: Create a method that prints all people that have last name beginning
		// with d
		printConditionally(people, new Condition() { //creating an inner anonymous implementation of the interface Condition
			@Override
			public boolean test(Person p) {
				return p.getLastName().toLowerCase().startsWith("d");
			}
		});

		System.out.println("Step 4...prints all elements in the list with first name beginning with c");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().toLowerCase().startsWith("c");
			}
		});
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
