package Assignment2;

import java.util.Comparator;
public class SortByAuthor implements Comparator<Book>{
		public int compare(Book a, Book b) {
			String author1=a.getAuthor();
			String author2=b.getAuthor();
			int r = author1.compareTo(author2);
			return r;
		}
	}

