package com.lumen.inter;

public class Developer extends Employee implements IGamer, IEntertainment{
String [] trips;
String [] courses;
	public Developer(String name, int empId, double salary, String[] trips, String[] courses) {
		super(name, empId, salary);
		this.trips = trips;
		this.courses = courses;
	}

	@Override
	public void vehicleIns() {
System.out.println("Developer Vehicle Insurance");
	}

	@Override
	public void healthIns() {
		System.out.println("Developer Health Insurance");

	}

	@Override
	void showCourses() {
		System.out.print("Developer Courses : ");
		for (String course : courses)
			System.out.println(course + ", ");
	}

	@Override
	public void showTrips() {
		System.out.print("Developer Trips : ");
		for (String trip : trips) {
			System.out.println(trip + ", ");
		}
	}

	@Override
	public void indoor() {
		
	}

	@Override
	public void outdoor() {
		
	}

}
