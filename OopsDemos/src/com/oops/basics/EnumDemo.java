package com.oops.basics;

enum Weekdays{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {

	public static void main(String[] args) {
		Weekdays weekday = Weekdays.FRIDAY;
		//convert enum to string
		System.out.println(weekday.name());
//		to get index from enum .Weekdays starts from zero
		System.out.println(weekday.ordinal());
//		static method to call in static ways
		Weekdays[] weekdayArr = Weekdays.values();
		for (Weekdays weekdays : weekdayArr){
			System.out.println(weekdays.name());
			
		}
		
		System.out.println("Converting String to Enum Constants");
		weekday = Weekdays.valueOf("MONDAY");
		System.out.println(weekday);
	}

}
