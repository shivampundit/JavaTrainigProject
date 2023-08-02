package com.oops.basics;

import java.util.Scanner;

enum Season{
	SUMMER, WINTER, RAINY, AUTUMN
	
}

public class EnumSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Season:");
		String choice = scanner.next().toUpperCase();
		
		Season season = Season.valueOf(choice);
		
		switch (season) {
		case SUMMER:
			System.out.println("Very Hot, Eat Icecreams");
			break;
		
		case WINTER:
			System.out.println("Drink more soups to keep yourself Warm");
			break;
		
		case RAINY:
			System.out.println("Stay at Home.");
			break;
		
		case AUTUMN:
			System.out.println("Lets Enjoy!");
			break;

		default:
			
			throw new IllegalArgumentException("Unexpected Value " + choice);
			
		}
	}

}
