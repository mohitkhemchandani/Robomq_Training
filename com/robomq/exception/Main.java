package com.robomq.exception;

public class Main {

	public static void main(String[] args) {
		SavingAccount a1 = new SavingAccount("John",28,25000);
		SavingAccount a2 = new SavingAccount("Mohit",17,20000);
		try
		{
			a1.createNewAccount();
			a2.createNewAccount();
		}
		catch (AgeException e)
		{
			System.out.println(e);
		}
	}

}
