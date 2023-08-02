package com.api.lang;

public class HashMain {

	public static void main(String[] args) {
		Book book1 = new Book("HeadFirst java", "Kathy", 18723456L);
		Book book2 = new Book("HeadFirst java", "John", 18723456L);
		Book book3 = new Book("java", "Kathy", 21873456L);
		
		System.out.println("1 and 2 : "+ book1.equals(book2));
		System.out.println("1 and 3 : "+ book1.equals(book3));
		System.out.println("1 Hash : "+ book1.hashCode());
		System.out.println("2 Hash : "+ book2.hashCode());
		System.out.println("3 Hash : "+ book3.hashCode());
	}

}
