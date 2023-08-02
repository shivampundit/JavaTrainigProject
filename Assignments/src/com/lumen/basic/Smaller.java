package com.lumen.basic;

public class Smaller {

	public static void main(String[] args) {
		int smallest = Integer.MAX_VALUE;
		int arr[] = { 12, 54, 65, 42, 28 };

		for (int num : arr) {
			if (num < smallest)
				smallest = num;

		}
		System.out.println(smallest);
	}

}
