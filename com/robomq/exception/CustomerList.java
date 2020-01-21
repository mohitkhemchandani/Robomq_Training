package com.robomq.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerList {
	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(21,"Mohit","00112233"));
		customers.add(new Customer(18,"Haris","1234579"));
		customers.add(new Customer(16,"Harshal","123456"));
		System.out.println(customers);
		
		Iterator itr =customers.iterator();
		while(itr.hasNext())
		{
			Object obj =itr.next();
			Customer c = (Customer)obj;
			System.out.println(c.getName());
			
			System.out.println("\nSorted By Customer Age \n");
			SortByAge s=new SortByAge();
			customers.sort(s);
			System.out.println(customers);
		}
	}
}
