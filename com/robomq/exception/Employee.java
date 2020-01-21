package com.robomq.exception;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int dno;
	public Employee(int id, String name, double salary, int dno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dno = dno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dno=" + dno + "]";
	}
	
	
	
	
}
