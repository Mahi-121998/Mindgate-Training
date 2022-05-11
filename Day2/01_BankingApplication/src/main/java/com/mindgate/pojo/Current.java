package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	
	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded constructor of current");
	}
	@Override
	public boolean withdraw(double amount) {
		if(amount>0) {
			setBalance(getBalance()-amount);
			if(amount>getBalance() && getOverdraftBalance()>amount) {
				setOverdraftBalance(getOverdraftBalance()-amount);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		
		setBalance(getBalance()+amount);
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
