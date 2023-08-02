package com.lumen.inter;

public abstract class Employee implements Insurance{
	String name;
	int empId;
	double salary;
	public Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	abstract void showCourses();
	
	void printDetails() {
		System.out.println(name);
		System.out.println(empId);
		System.out.println(salary);
	}

	
}
