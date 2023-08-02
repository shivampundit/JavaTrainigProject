package com.bookapp.client;

import com.bookapp.model.Book;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.model.Book;

public class BookMain {

	public static <Book> void main(String[] args) throws BookNotFoundException {
		IBookService bookService = new BookServiceImpl();

		bookService.getAll().stream().forEach(System.out::println);

		System.out.println();
		List<com.bookapp.model.Book> books = bookService.getByAuthorContains("Munshi Premchand");
		// forEach(System.out::println);
		for (com.bookapp.model.Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		books = bookService.getByCategory("Novel");
		for (com.bookapp.model.Book book : books) {
			System.out.println(book);
		}

		System.out.println();
		books = bookService.getByPriceLessThan(300);
		for (com.bookapp.model.Book book : books) {
			System.out.println(book);
		}

		System.out.println();
		books = bookService.getByAuthorContainsAndCAtegory("Chetan Bhagat", "Novel");
		for (com.bookapp.model.Book book : books) {
			System.out.println(book);
		}

		System.out.println();
		System.out.println(bookService.getById(2));

	}

}
