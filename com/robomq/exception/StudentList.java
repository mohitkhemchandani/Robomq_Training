package com.robomq.exception;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class StudentList {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();
		students.add(new Student(101,"hello",345));
		students.add(new Student(101,"kelly",345));
		Collections.sort(students);
		System.out.println(students);
	}

}
