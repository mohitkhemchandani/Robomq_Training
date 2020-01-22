package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookList {
	
	
	public static void main(String[] args) {
		String choice="y";

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Mohit",1,"MK","Hello",2));
		books.add(new Book("Haris",2,"Mh","Hello1",3));
		books.add(new Book("John",4,"HK","Hello2",1));
		books.add(new Book("Kelly",5,"KK","Hello3",4));
		books.add(new Book("Smith",3,"DK","Hello4",2));
		//Iterator itr =books.iterator();
//		while(itr.hasNext())
//		{
//			Object obj =itr.next();
//			Book m = (Book)obj;
//			//1System.out.println(m);		
//		}
		
		Scanner sc =new Scanner(System.in);
		while(choice.equals("y")) {
			try {
				System.out.print("Enter choice by which you want to sort\n(1. Sort by Id \n 2. Sort by author \n 3. Sort by publisher \n 4.Sort by Name \n 5. Sort by Quantity\n): ");
				
				int scan = sc.nextInt();
				switch(scan) {
					case 1: System.out.println("\nSorted By Member's Id \n");
						SortById s=new SortById();
						books.sort(s);
						System.out.println(books);
						break;
					case 2: System.out.println("\nSorted By Book's Author \n");
						SortByAuthor s1=new SortByAuthor();
						books.sort(s1);
						System.out.println(books);
						break;
					case 3: System.out.println("\nSorted By Book's Publisher \n");
						SortByPublisher s2=new SortByPublisher();
						books.sort(s2);
						System.out.println(books);
						break;
					case 4: System.out.println("\nSorted By Book's Name \n");
						SortByNam s3=new SortByNam();
						books.sort(s3);
						System.out.println(books);
						break;
					case 5: System.out.println("\n Sorted By Book's Quantity \n");
						SortByQuantity s4 = new SortByQuantity();
						books.sort(s4);
						System.out.println(books);
						break;
					default:System.out.println("Invalid Input....");
					}
				}
				catch(Exception e)
				{
					System.out.println("Invalid Input...");
				}
				System.out.println("Would you like to continue?(y/n)");
				choice = sc.next();
			}
		if (choice.equals("n"))
			System.out.println("ThankYou for using...!");
	}
}

