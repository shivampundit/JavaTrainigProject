package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Ram", 12, 2000.0);

		System.out.println(employee.empName);
		System.out.println(employee.empId);

		employee.empName = "Shivam";
		employee.empId = 11;
		employee.salary = 2000;
		
		employee.printDetails();
		
		String result = employee.greet("Great Day! ");
				
		System.out.println(result);
		

		Employee employee1 = new Employee("Shyam", 13, 3000.0);

		employee1.empName = "Yash";
		employee1.empId = 12;
		employee1.salary = 12000;
		employee1.printDetails();
		System.out.println("Employee1 Name : " + employee1.greet("Welcome "));
//		System.out.println("Employee1 Id : " + employee1.empId);
//		System.out.println("Employee1 Salary : " + employee1.salary);

//		Employee employee2 = employee;
//
//		System.out.println("Employee2 Name : " + employee2.empName);
//		employee2.empName = "Tiwari";
//		System.out.println("Employee2 Name : " + employee2.empName);
//		System.out.println("Employee Name : " + employee.empName);

//		employee = null; // nullPointerException if access
//		System.out.println("Employee2 Name : " + employee2.empName);
//		System.out.println("Employee Name : " + employee.empName);
	}

}


