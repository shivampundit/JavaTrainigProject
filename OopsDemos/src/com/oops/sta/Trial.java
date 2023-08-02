package com.oops.sta;

public class Trial {
	static int x;
	static int y=10;
	
	static {
		System.out.println("In Static Block ");
		x = 200;
	}
	static {
		System.out.println("In Static Block2 ");
		x = 200;
	}
	static void getMessage() {
		System.out.println("In static Method");
		System.out.println("Sum : " + (x+y));
	}
	public static void main(String[] args) {
		System.out.println("In Main");
		getMessage();
		System.out.println("Sum : " + (x+y));
		
	}
}
