package com.lumen.abss;
 

public class MainVehicle {
	public static void main(String[] args) {
		Vehicle vehicle  = new Bike("Bullet", "Royal Infield", 250000.0, "300CC");
		vehicle.printDetails();
		
		Bike bike  = (Bike)vehicle;
		bike.engineType();
		bike.getMileage();
		bike.showType();
		String[] accessories = {"Seat Cover", "Cleaner Spray", "Other"};
		Vehicle vehicle2  = new Car("Indigo", "Honda", 950000.0, accessories);
		vehicle2.printDetails();
		
		Car car = (Car)vehicle2;
		car.showAccessories();
		car.getMileage();
		car.showType();
	}
	


	
		
}
