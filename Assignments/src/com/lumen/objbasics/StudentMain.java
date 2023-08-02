package com.lumen.objbasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scanner.next();
		System.out.println("Enter Department: ");
		String department = scanner.next();
		System.out.println("Enter Marks(5 Subjects: ");
		int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
		}
		Student student = new Student(name, department);

		student.printDetails();
		System.out.println("Grade : " + student.getGrades(marks));
	}

}
