package com.lumen.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int res;
		int mark = 3;
		int val = 10;
		if (val >= 1)
			System.out.println(first);
		if (val >= 2)
			System.out.println(second);
		while (mark <= val) {
			res = first + second;
			System.out.println(res);
			first = second;
			second = res;
			mark++;
		}
	}

}
