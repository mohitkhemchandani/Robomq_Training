package com.robomq.exception;

import java.util.Scanner;

public class EmployeeSystem {

	public static void main(String[] args) {
		Employee employees[] =new Employee[3];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee's id ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name ");
		String name = sc.next();
		System.out.println("Enter salary ");
		double salary = sc.nextDouble();
		System.out.println("Enter the department number ");
		int dno = sc.nextInt();
		
		if (dno==10 || dno==20 || dno==30 || dno==40) {
			try
			{
				Employee e = new Employee(id,name,salary,dno);
				employees[i]=e;
			}
			catch{
				
			}
		}
	}

}
