package com.lumen.basic;

public class SecondSmall {

	public static void main(String[] args) {
		int smallest = Integer.MAX_VALUE;
		int secondSmall = smallest;
		int arr[] = { 12, 54, 65, 42, 28 };

		for (int num : arr) {
			if (num < smallest) {
				secondSmall = smallest;
				smallest = num;
			} else if (num < secondSmall && smallest != secondSmall)
				secondSmall = num;

		}
		System.out.println(secondSmall);
	}
}
