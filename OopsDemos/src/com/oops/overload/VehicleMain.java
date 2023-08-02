package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.print();
		vehicle = new Vehicle("A100");
		vehicle.print();
		vehicle = new Vehicle("A100", 1200000);
		vehicle.print();
		vehicle = new Vehicle("A100", "Audi", 9000000);
		vehicle.print();
	}

}


// create a mobile class , model as instance variable, create a method
//as showFeatures(String... features)