package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AcoountApplicationMainV3 {
	public static void main(String[] args) {
		System.out.println("Wlcome to XYZ Bank");
		Scanner scanner= new Scanner(System.in);
		
		int accountnumber;
		String name;
		Double balance;
		boolean result;
		String continueChoice;
		Double amount;
		
		System.out.println("Enter Account Number :");
		accountnumber=scanner.nextInt();
		
		System.out.println("Enter Name :");
		name=scanner.next();
		
		System.out.println("Enter Balance");
		balance=scanner.nextDouble();
		
		
		Account account=new Account(accountnumber, name, balance) ;
		account.setAccountNumber(accountnumber);
		account.setName(name);
		account.setBalance(balance);
		
		
		
		System.out.println("Account opened Succesfully");
		do {
			
		
		System.out.println();
		System.out.println("Menu");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balance");
		
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Enter amonut");
			amount= scanner.nextDouble();
			result=account.withdraw(amount);
			if(result) {
				System.out.println("Withdraw Successfully");
				System.out.println("Balance :"+account.getBalance());
			}
			else {
				System.out.println("WithdraW failed");
				System.out.println("balance :"+ account.getBalance());
				}
			break;
		case 2: 
			System.out.println("Enter amonut");
			amount= scanner.nextDouble();
			result=account.deposit(amount);
			if(result) {
				System.out.println("Deposit Successfully");
				System.out.println("Balance :"+account.getBalance());
			}
			else {
				System.out.println("Deposit failed");
				System.out.println("balance :"+ account.getBalance());
				}
			break;
		case 3:
			System.out.println("Account balance");
			System.out.println("balance: "+account.getBalance());
			break;
		default:
			System.out.println("invalid choice");
			
		}
		System.out.println("do you want to continue");
		continueChoice=scanner.next();
		}while(continueChoice.equals("yes"));
		System.out.println("thank you");
		
		
		}
	

}
