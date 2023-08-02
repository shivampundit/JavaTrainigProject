package com.lumen.inter;

public class EmployeeMian {

	public static void main(String[] args) {
		String [] courses = {"Java Advance", "Django", "Micro Services"};
		String [] trips = {"Goa", "Shimla", "Varanasi"};
		
		Employee employee = new Manager("Yash", 102, 2000.4, 190, courses, trips);
		
		Insurance insurance = (Insurance)employee;
		
		IEntertainment ientertainment = (IEntertainment)employee;
		employee.printDetails();
		insurance.healthIns();
		insurance.vehicleIns();
		employee.showCourses();
		ientertainment.showTrips();
		
		Manager manager = (Manager)employee;
		manager.calBonus();
		
		
		
		
		Employee newEmployee = new Developer("Shivam", 111, 3000.6, trips, courses);
		
		insurance = (Insurance)newEmployee;
		ientertainment = (IEntertainment)newEmployee;
		newEmployee.printDetails();
		newEmployee.healthIns();
		newEmployee.vehicleIns();
		newEmployee.showCourses();
		ientertainment.showTrips();
		
		
		

			
	}

}
