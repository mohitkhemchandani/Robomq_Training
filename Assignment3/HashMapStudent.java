package Assignment3;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudent {
	public static void main(String[] args) {
		HashMap<Integer,Student>students = new HashMap<Integer,Student>();
		students.put(1,new Student("Priya",12,100));
		students.put(2,new Student("Naman",10,350));
		students.put(3,new Student("Rakhi",15,450));		
		System.out.println(students);
		Set<Integer>keys=students.keySet();
		String grade=null;
		for(Integer i:keys)
		{
			Student s=students.get(i);
			if (s.getMarks()>300)
				grade="A";
			else if (s.getMarks()< 300 && s.getMarks() > 250)
				grade="B";
			else
				grade="C";
			System.out.println(s.getName() +" Scored " +grade+ " Grade in Current Sem.");
		}
	}
}
