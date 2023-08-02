package com.oops.basics;

public class Employee {
	String empName;
	int empId;
	double salary;
	
	Employee(String empName, int empId, double salary){
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	

	void printDetails() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Salary : " + salary);
	}
	String greet(String msg ) {
		return msg + empName;
		
	}
}
