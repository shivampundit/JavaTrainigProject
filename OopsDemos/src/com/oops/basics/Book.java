package com.oops.basics;

public class Book {
	String title;
	String author;
	double price;

	void printDetails() {
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}



	double getDiscountedPrice(int amount) {
		return price-amount;

	}
}
