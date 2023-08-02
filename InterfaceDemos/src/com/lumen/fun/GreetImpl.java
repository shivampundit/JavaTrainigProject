package com.lumen.fun;

public class GreetImpl implements Greeter {

	@Override
	public void greetUser(String username) {
		System.out.println("Have a good day! " + username);
	}

}
