package com.lumen.objbasics;

public class Book {
	String title;
	String author;
	double price;
	
	

	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void printDetails() {
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}

	void bookType() {
		if (price > 500)
			System.out.println("Premium book");
		else
			System.out.println("Standard book");

	}

}
