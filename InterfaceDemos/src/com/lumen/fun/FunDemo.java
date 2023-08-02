package com.lumen.fun;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {
		// implementing consumer using lambda
		Consumer<String> con = (str) -> System.out.println(str.toUpperCase());
		// calling method
		con.accept("Shivam");

		// Doing it for integer
		Consumer<Integer> con1 = (val) -> System.out.println(val);

		con1.accept(12);

		Consumer<Book> bookCon = (book) -> System.out.println(book);
//		Book book = new Book()("Two State", "Chetan Bhagat", "Novel", 3, 240.0);
		bookCon.accept(new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0));

		Supplier<String> supplier = () -> "Hello";
		System.out.println(supplier.get());

		Supplier<Integer> intSupplier = () -> 65;
		System.out.println(intSupplier.get());

		Supplier<Book> bookSupplier = () -> new Book("Two State", "Chetan Bhagat", "Novel", 3, 240.0);
		System.out.println(bookSupplier.get());

	}

}
