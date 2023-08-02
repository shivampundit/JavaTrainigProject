package com.lumen.optional;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<String> courseOptional = Arrays.asList("Java", "Angular", "Node", "Spring").stream()
				.filter(str -> str.length() > 10).findFirst();// returns the optional

		if (courseOptional.isPresent())
			System.out.println(courseOptional.get());
		if (!courseOptional.isEmpty())
			System.out.println(courseOptional.get());

		courseOptional.ifPresent(System.out::println);

		String cname = Arrays.asList("Java", "Angular", "Node", "Spring").stream().filter(str -> str.length() > 1)
				.findFirst()
//				.get() //if no value throw exception (No such element exception)
				.orElse("No Courses"); // if value is present return it or return the value in orElse
		System.out.println(cname);
		cname = Arrays.asList("Java", "Angular", "Node", "Spring").stream().filter(str -> str.length() > 1).findFirst()
				.orElseGet(() -> "Hello");
		System.out.println(cname);

		cname = Arrays.asList("Java", "Angular", "Node", "Spring").stream().filter(str -> str.length() > 1).findFirst()
				.orElseThrow(() -> new NoSuchElementException("No value present"));

	}

}
