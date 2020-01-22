package Assignment3;

import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetString {
	public static void main(String[] args) {
	TreeSet<String> countries = new TreeSet<String>();
	String ch="y";
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Enter Country Name: ");
		countries.add(sc.next());
		System.out.println("Would you like to continue?(y/n)");
		ch=sc.next();
		if(ch.equals("y"))
			continue;
		else
			break;
	}
	System.out.println(countries);
	}
}
