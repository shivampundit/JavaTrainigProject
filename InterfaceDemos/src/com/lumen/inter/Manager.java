package com.lumen.inter;

public class Manager extends Employee implements IEntertainment {
	int amount;
	String[] courses;
	String[] trips;

	public Manager(String name, int empId, double salary, int amount, String[] courses, String[] trips) {
		super(name, empId, salary);
		this.amount = amount;
		this.courses = courses;
		this.trips = trips;
	}

	@Override
	public void vehicleIns() {
		System.out.println("Manager Vehicle Insurance");
	}

	@Override
	public void healthIns() {
		System.out.println("Manager Health Insurance");
	}

	@Override
	void showCourses() {
		System.out.print("Manager Couses : ");
		for (String course : courses)
			System.out.println(course + ", ");

	}

	@Override
	public void showTrips() {
		System.out.print("Manager Trips : ");
		for (String trip : trips) {
			System.out.println(trip + ", ");
		}

	}

	void calBonus() {
		System.out.println("Total Sal with Bonus : " + (salary + amount));

	}

}
