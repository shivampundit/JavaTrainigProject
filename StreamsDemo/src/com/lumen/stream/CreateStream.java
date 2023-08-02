package com.lumen.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		String[] names = new String[] { "Shivam", "Yash", "Saba", "Venkatesh", "Sonam", "Viruchith" };
		// create a stream of array
		Stream.of(names).forEach(name -> System.out.println(name));
		System.out.println();
		// use for list
		Arrays.stream(names).forEach(name -> System.out.println(name));
		System.out.println();

		int[] nums = { 10, 53, 98, 345, 23, 46 };
		int sum = Arrays.stream(nums, 0, 6).filter(num -> (num % 2 == 0)).sum();
		System.out.println(sum);

		// converting into String and then int to get sum
		System.out.println();
		IntStream intStream = Arrays.stream(nums, 0, 6);
		int sum2 = intStream.mapToObj(num -> String.valueOf(num)).mapToInt(str -> Integer.parseInt(str)).sum();
		System.out.println(sum2);

		Arrays.stream(nums).map(num -> (int) Math.pow(num, 2)).forEach(n -> System.out.println(n));

		System.out.println();
		// Create an infinite Stream
		Stream.generate(() -> "Hello").limit(5).forEach(System.out::println);

	}

}
