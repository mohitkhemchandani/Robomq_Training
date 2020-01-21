package com.robomq.exception;

import java.math.BigInteger;


public class Customer{
	private int age;
	private String name;
	private String phoneNum;
	public Customer(int age, String name, String phoneNum) {
		this.age = age;
		this.name = name;
		this.phoneNum = phoneNum;
	}
		public int getAge() //getter for private property
		{
			return age;
		}
		public void setAge(int age)//setter for private property
		{
			this.age=age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum=phoneNum;
		}
		@Override
		public String toString() {
			return "Customer [age=" + age + ", \nname=" + name + ", \nPhone number=" + phoneNum + "]";
		}
		
	}
	