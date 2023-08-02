package com.lumen.objbasics;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("Two States", "Chetan Bhagat", 600);

		book.printDetails();
		book.bookType();

		Book book1 = new Book("Bhagwat Gita", "Gorakhpur Expres", 400);

		book1.printDetails();
		book1.bookType();

	}

}
