package com.lumen.basic;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 12, 54, 65, 42, 28 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int element : arr) {
			System.out.println(element);
		}

	}

}
