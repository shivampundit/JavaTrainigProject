package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	/*
	 * @Override public void addBook(Book book) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 */

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		System.out.println("All Books: ");
		List<Book> books = BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByAuthor = new ArrayList<Book>();
		System.out.println("Book By Author : " + author);

		List<Book> bookByAuthor = books.stream().filter(book -> book.getAuthor().equals(author))
				.collect(Collectors.toList());
//		for (Book book : books) {
//			if (book.getAuthor().equals(author))
//				bookByAuthor.add(book);
//		}

		if (bookByAuthor.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		return bookByAuthor;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByCategory = new ArrayList<Book>();
		System.out.println("Book By Category : " + category);
		List<Book> bookByCategory = books.stream().filter(book -> book.getCategory().equals(category))
				.collect(Collectors.toList());
//		for (Book book : books) {
//			if (book.getCategory().equals(category))
//				bookByCategory.add(book);
//		}

		if (bookByCategory.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		return bookByCategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByPriceLessThan = new ArrayList<Book>();
		System.out.println("Book Price less than :" + price);
		List<Book> bookByPriceLessThan = books.stream().filter(book -> book.getPrice() < price)
				.collect(Collectors.toList());
//		for (Book book : books) {
//			if (book.getPrice() <= price)
//				bookByPriceLessThan.add(book);
//
//		}

		if (bookByPriceLessThan.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		return bookByPriceLessThan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCAtegory(String author, String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByAuthorContainsAndCAtegory = new ArrayList<Book>();
		System.out.println("Book By Author : " + author + " and category : " + category);
		List<Book> bookByAuthorContainsAndCAtegory = books.stream().filter(book -> book.getAuthor().equals(author))
				.filter(book -> book.getCategory().equals(category)).collect(Collectors.toList());

//		for (Book book : books) {
//			if (book.getAuthor().equals(author) && book.getCategory().equals(category))
//				bookByAuthorContainsAndCAtegory.add(book);
//		}
		if (bookByAuthorContainsAndCAtegory.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		return bookByAuthorContainsAndCAtegory;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		System.out.println("Book By BookId : " + bookId);
		boolean check = true;
//		Book book1 = books.stream().filter(book -> book.getBookId().equals(bookId)));
		check = books.stream().anyMatch(book -> book.getBookId().equals(bookId));
		for (Book book : books) {
			if (book.getBookId() == (Integer) bookId) { 
				return book;
			}

		}
		if (!check)
			throw new BookNotFoundException("Book Not Found");
		return null;

	}

}
