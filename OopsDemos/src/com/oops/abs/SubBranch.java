package com.oops.abs;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("Car loan in subBranch");

	}
	
	@Override
	void eduLoan() {
		System.out.println("EduLoan in subBranch");
		super.eduLoan();
	}

	void subPay() {
		System.out.println("Payment in SubBranch");
	}

}
