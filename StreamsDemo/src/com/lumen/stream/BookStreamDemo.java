package com.lumen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookStreamDemo {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Poosh ki Raat", "Munshi Premchand", "Story", 1, 230.0),
				new Book("Gaban", "Munshi Premchand", "Novel", 2, 197.0),
				new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0));
		/*
		 * books.stream().filter(book ->
		 * book.getAuthor().equals("Chetan Bhagat")).map(book -> book.getTitle()) //
		 * .forEach(name -> System.out.println(name.getTitle())); .forEach(name ->
		 * System.out.println(name));
		 * 
		 */
		books.stream().map(book -> book.getTitle()).map(title -> title.length())
				.map(length -> (int) Math.pow(length, 2)).collect(Collectors.toList())
				.forEach(sqr -> System.out.println(sqr));
		System.out.println();
		books.stream().map(book -> (int) Math.pow(book.getTitle().length(), 2)).collect(Collectors.toList())
				.forEach(sqr -> System.out.println(sqr));

	}

}
