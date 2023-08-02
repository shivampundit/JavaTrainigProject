package com.lumen.basic;

public class Greater {

	public static void main(String[] args) {
		int greatest = Integer.MIN_VALUE;
		int arr[] = { 12, 54, 65, 42, 28 };

		for (int num : arr) {
			if (num > greatest)
				greatest = num;

		}
		System.out.println(greatest);

	}
}
