package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class BookMain {

	public static <Book> void main(String[] args) throws BookNotFoundException {
		IBookService bookService = new BookServiceImpl();

		bookService.getAll().stream().forEach(System.out::println);

		System.out.println();
		bookService.getByAuthorContains("Munshi Premchand").stream().forEach(System.out::println);

		System.out.println();
		bookService.getByCategory("Novel").stream().forEach(System.out::println);

		System.out.println();
		bookService.getByPriceLessThan(300).stream().forEach(System.out::println);

		System.out.println();
		bookService.getByAuthorContainsAndCAtegory("Chetan Bhagat", "Novel").stream().forEach(System.out::println);
//
		System.out.println();
		System.out.println(bookService.getById(2));

	}

}
