package com.lumen.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Name: ");
		String name = scanner.next();
		System.out.println("Choose designation: Programmer, Manager, Director ");
		String designation = scanner.next();
		Employee employee = new Employee(name, designation);

		employee.printDetails();
		double basicAllowance = 2300;
		double carAllowance = 3400;
		double housingAllowance = 4800;
		if (designation.equals("Programmer"))
			System.out.println(employee.calcBonus(basicAllowance));
		else if (designation.equals("Manager"))
			System.out.println(employee.calcBonus(basicAllowance, carAllowance));
		else if(designation.equals("Director"))
			System.out.println(employee.calcBonus(basicAllowance, carAllowance, housingAllowance));
		else
			System.out.println("Choose correct designation: ");
	}

}
