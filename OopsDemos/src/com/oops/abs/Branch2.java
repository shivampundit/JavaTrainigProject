package com.oops.abs;

public abstract class Branch2 extends Bank{

	@Override
	void housingLoan() {
		System.out.println("housingLoan  details in Branch2 ");
	}

	@Override
	void eduLoan() {
		
		System.out.println("eduLoan  details in Branch2 ");
	}
	
	void getPayment()
	{
		System.out.println("Payment  details in Branch2 ");
	}

}
