package com.robomq.exception;

public class SavingAccount {
	private String name;
	private int age;
	private double balance;
	
	public SavingAccount(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	public void createNewAccount() throws AgeException{
		if (age >18) {
			System.out.println("Request Registered for "+name+" Successfully");
		}
		else
			throw new AgeException();
	}
}
