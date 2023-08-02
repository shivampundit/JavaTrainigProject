package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks() {
		return Arrays.asList(new Book("Poosh ki Raat", "Munshi Premchand", "Story", 1, 230.0),
				new Book("Gaban", "Munshi Premchand", "Novel", 2, 197.0),
				new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0),
				new Book("Half GirlFriend", "Chetan Bhagat", "Novel", 4, 330.0),
				new Book("Ram Charit Manas", "Tulsi Das", "Novel", 5, 730.0)

		);

	}
}
