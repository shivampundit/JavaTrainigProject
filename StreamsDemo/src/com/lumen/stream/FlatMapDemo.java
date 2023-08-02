package com.lumen.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		String[] names = new String[] { "Shivam", "Yash", "Saba", "Rakshita", "Venkatesh" };

		Arrays.stream(names).forEach(System.out::println);

		String[][] twoNames = new String[][] { { "HTML", "CSS" }, { "JavaScript", "JAVA" }, { "Node", "React" } };

		Stream<String[]> streamTwo = Arrays.stream(twoNames);

		Stream<String> streamOne = streamTwo.flatMap(oneArr -> Arrays.stream(oneArr));
		System.out.println();
		streamOne.map(String::length).forEach(System.out::println);
		System.out.println();
		Arrays.stream(twoNames).flatMap(oneArr -> Arrays.stream(oneArr)).map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
