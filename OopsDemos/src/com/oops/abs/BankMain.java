package com.oops.abs;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Branch1();

		bank.housingLoan();
		bank.carLoan();
		bank.eduLoan();
		bank.admin();

		Branch1 branch1 = (Branch1) bank;
		branch1.getPay();

		Bank newbank = new SubBranch();
		newbank.housingLoan();
		newbank.eduLoan();
		newbank.carLoan();
		newbank.admin();

		Branch2 branch2 = (Branch2) newbank;
		branch2.getPayment();

		SubBranch subbranch = (SubBranch) newbank;
		subbranch.getPayment();
		subbranch.subPay();

	}

}
