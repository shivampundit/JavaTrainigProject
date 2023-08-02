package com.lumen.objbasics;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	void printDetails() {
		System.out.println(name);
		System.out.println(department);
	}

	String getGrades(int... marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		double avg = (double) sum / marks.length;

		if (avg >= 90)
			return "A";
		else if (avg >= 80)
			return "B";
		else if (avg >= 70)
			return "C";
		else if (avg >= 50)
			return "D";
		else if (avg >= 80)
			return "E";
		else
			return "fail";
	}
}
