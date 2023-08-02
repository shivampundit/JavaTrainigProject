package com.oops.abs;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("CarLoan  details in Branch1 ");
	}

	@Override
	void housingLoan() {
		System.out.println("housingLoan  details in Branch1 ");
	}

	@Override
	void eduLoan() {
		System.out.println("eduLoan  details in Branch1 ");
	}
	
	void getPay()
	{
		System.out.println("Payment  details in Branch1 ");
	}

	@Override
	void admin() {
		System.out.println("In Branch1 Admin");
	}
	

}
