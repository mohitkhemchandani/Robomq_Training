package Assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetString {

	public static void main(String[] args) {
		HashSet<String> countries = new HashSet<String>();
		String ch="y";
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Country Name ");
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
