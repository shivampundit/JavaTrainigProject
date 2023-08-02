package com.lumen.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Two State", "Chetan Bhagat", 347.0);
		Book book2 = new Book("Bhagwat Gita", "GKP Express", 567.0);
		Book book3 = new Book("Poosh Ki Raat", "Premchand", 157.0);
		Book book4 = new Book("Godaan", "Premchand", 197.0);

		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		System.out.println("Before Sorting: ");

		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book name = iterator.next();
			System.out.println(name);
		}

		Collections.sort(books);
		System.out.println("After Sorting: ");

		for(Book book : books) {
			System.out.println(book);
		}

		List<Book> booksByAuthor = new ArrayList<Book>();
		String author = "Premchand";

		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				booksByAuthor.add(book);
			}

		}

		System.out.println("Book By Author " + author);

		Iterator<Book> iterator2 = booksByAuthor.iterator();

		while (iterator2.hasNext()) {
			Book bookName = iterator2.next();
			System.out.println(bookName);
		}

	}

}
