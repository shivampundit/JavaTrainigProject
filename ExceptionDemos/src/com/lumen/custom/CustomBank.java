package com.lumen.custom;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws ExceedingLimitException, NegativeBalanceException {
//		try {
			System.out.println("In Withdraw ");
			if (amount > 1000)
				throw new ExceedingLimitException("Limit Exceeded.");
				
			if(balance - amount>= 0)throw new NegativeBalanceException("Balance is Negative");
			balance -= amount;
			System.out.println("Balance " + balance);
//		} 
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//			throw e;
//		} finally {
//			System.out.println("Close");
//		}
//		System.out.println("Completed!");
	}

}
