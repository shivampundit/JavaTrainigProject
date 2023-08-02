package com.oops.inher;

public class ElectronicMain {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("S5", "OPPO", 23000.0, "Front");
		mobile.print();
		mobile.showCameraType();
		String[] ports = {"HDMI", "LAN", "USB"};
		Laptop laptop = new Laptop("Vivobook", "ASUS", 400000,ports );
		laptop.print();
		laptop.showPorts();
		
		
	}

}
