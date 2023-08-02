package com.api.lang;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Raj", 10, 3000);

		System.out.println(employee);

		int x = 10;
		long y = x; // upcasting

		Long a = y; // (autoboxing)

		int b = (int) y; // downcasting

		// convert to object using upcasting
		Object o = a; // type of Long

		// trying to downcast will through an classCastException

		Integer i = (Integer) o; // exception

	}

}
