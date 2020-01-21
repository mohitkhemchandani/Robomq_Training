package com.robomq.exception;

public class AgeException extends Exception {
	public AgeException() {
		System.out.println("Age should be greater than 18 to create an account");
	}
}
