package com.oops.sta;

import static java.lang.Integer.parseInt;
import static com.oops.sta.Trial.*;

public class Demo {
	static {
		System.out.println("Static Block in Demo");
	}

	public static void main(String[] args) {
		System.out.println("Main Demo");
		getMessage();

		int x = 100;
		int y = 200;

		System.out.println("Sum : " + (x + y));

		int n = parseInt("100");
		System.out.println(n);

	}
}
