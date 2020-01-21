package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;

public class BookList {

	public static void main(String[] args) {
		ArrayList<Book> members = new ArrayList<Book>();
		members.add(new Book("Mohit",1,"MK","Hello",2));
		members.add(new Book("Haris",2,"Mh","Hello1",3));
		members.add(new Book("John",1,"HK","Hello2",1));
		members.add(new Book("Kelly",1,"KK","Hello3",4));
		members.add(new Book("Smith",1,"DK","Hello4",2));
		Iterator itr =members.iterator();
		while(itr.hasNext())
		{
			Object obj =itr.next();
			Book m = (Book)obj;
			System.out.println(m);		
		}
	}
}

