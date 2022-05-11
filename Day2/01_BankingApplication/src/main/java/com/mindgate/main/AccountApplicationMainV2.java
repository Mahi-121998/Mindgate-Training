package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account= new Account(101,"mahima",1000);
		boolean result = account.withdraw(200);
		if(result) {
			System.out.println("transaction completed successfully");
			System.out.println("balance :"+account.getBalance());
		}
		else {
			System.out.println("Transaction Failled");
			System.out.println("Balance :"+account.getBalance());
		}
		System.out.println("-".repeat(50));
		//deposit
		result =account.deposit(1000);
		if(result) {
			System.out.println("transaction completed successfully");
			System.out.println("balance :"+account.getBalance());
		}
		else {
			System.out.println("Transaction Failled");
			System.out.println("Balance :"+account.getBalance());
		}
		
	}

}
