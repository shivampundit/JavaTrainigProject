package com.lumen.fun;

public class LambdaDemo {
	public static void main(String[] args) {
		/*
		 * Greeter greeter = (String username) -> { System.out.println("Hello " +
		 * username); }; greeter.greetUser("Shivam");
		 * 
		 * Greeter greeter1 = username -> System.out.println("Hello " + username);
		 * greeter1.greetUser("Yash");
		 */
		Checker checker = (username, city) -> {
			if (username.equals("Shivam") && city.equals("Kanpur"))
				return true;
			else
				return false;

		};
		boolean flag = checker.checkName("Shivam", "Kanpur");
		System.out.println(flag);

	}
}
