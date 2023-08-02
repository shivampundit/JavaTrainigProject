package com.lumen.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncDemo {

	public static void main(String[] args) {
		Function<String, Integer> function = (str) -> str.length();
		System.out.println(function.apply("Shivam"));

		Function<String, String> function1 = (str) -> str.toUpperCase();
		System.err.println(function1.apply("Shivam"));

		Function<Book, String> function2 = (book) -> book.getTitle();
		System.err.println(function2.apply(new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0)));

		Function<String, Book> function3 = (author) -> {
			if (author.equals("Chetan Bhagat"))
				return new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0);
			else
				return null;
		};

		System.err.println(function3.apply("Chetan Bhagat"));

		Function<Integer, List<String>> function4 = (num) -> {
			if (num == 2)
				return Arrays.asList("Java", "React");
			else if (num == 3)
				return Arrays.asList("Java", "React", "Angular");
			else
				return null;
		};

		System.err.println(function4.apply(3));

		Predicate<String> predicate = (str) -> {
			if (str.equals("Shivam"))
				return true;
			else
				return false;
		};

		System.out.println(predicate.test("Shivam"));

	}

}
