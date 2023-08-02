package com.lumen.basic;

public class SecondLarge {

	public static void main(String[] args) {
		int largest = Integer.MIN_VALUE;
		int secondLarge = largest;
		int arr[] = { 12, 54, 65, 42, 28 };

		for (int num : arr) {
			if (num > largest) {
				secondLarge = largest;
				largest = num;
			} else if (num > secondLarge && largest != secondLarge)
				secondLarge = num;

		}
		System.out.println(secondLarge);
	}
	}

