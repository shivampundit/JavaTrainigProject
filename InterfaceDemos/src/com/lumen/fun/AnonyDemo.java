package com.lumen.fun;

public class AnonyDemo {

	public static void main(String[] args) {
		Greeter greeter = new GreetImpl();
		greeter.greetUser("Shivam");

		Greeter greetOne = new Greeter() {

			@Override
			public void greetUser(String username) {
				System.out.println("Great Day " + username);
			}
		};
		greetOne.greetUser("Yash");
		
		Greeter greetTwo = new Greeter() {

			@Override
			public void greetUser(String username) {
				System.out.println("Great Day " + username);
			}
		};
		greetTwo.greetUser("Ventkesh");
		

	}

}
