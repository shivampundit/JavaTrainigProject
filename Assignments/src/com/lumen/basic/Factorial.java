package com.lumen.basic;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;

		int result = 1;
		if (num == 0)
			result = 1;
		else {
			for (int val = 1; val <= num; val++)
				result *= val;
		}

		System.out.println(result);
	}

}
