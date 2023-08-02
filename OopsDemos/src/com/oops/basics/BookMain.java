package com.oops.basics;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book();

		book.title = "Two States";
		book.author = "Chetan Bhagat";
		book.price = 600;

		book.printDetails();

		double discountedPrice = book.getDiscountedPrice(80);

		System.out.println("Discounted Price : " +discountedPrice);

		Book book1 = new Book();

		book1.title = "Bhagwat Gita";
		book1.author = "Gorakhpur Expres";
		book1.price = 500;

		book1.printDetails();

		System.out.println("Discounted Price : " + book1.getDiscountedPrice(70));

	}
}
