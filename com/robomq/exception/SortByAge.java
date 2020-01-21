package com.robomq.exception;

import java.util.Comparator;

public class SortByAge implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		int a = (int) ((int) c1.getAge() - c2.getAge());
		return a;
	}
	
}
