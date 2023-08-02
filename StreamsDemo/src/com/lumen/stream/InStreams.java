package com.lumen.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class InStreams {
	public static void main(String[] args) {
//		Consumer<String> con = (str) -> System.out.println(str);

		List<String> courses = Arrays.asList("Java", "Angular", "Angular", "Node", "Spring", "CSS", "React");
		Iterator<String> iterator = courses.stream().filter(str -> str.length() > 4).skip(2).iterator();

		while (iterator.hasNext()) {
			String cname = iterator.next();
			System.out.println(cname);
		}

		System.out.println();

		courses.stream().filter(str -> str.length() > 4).distinct().limit(2)
				.forEach(str -> System.out.println(str.toUpperCase()));

		System.out.println();
		List<Integer> ncourses = courses.stream().sorted().map(str -> str.length()).filter(num -> num > 4)
				.collect(Collectors.toList());
		ncourses.forEach(num -> System.out.println(num));

		System.out.println();
		List<Integer> coursesList = courses.stream().map(str -> str.length()).filter(num -> (num % 2 == 0))
				.collect(Collectors.toList());
		coursesList.forEach(num -> System.out.println(num));
		
		
	}

}
