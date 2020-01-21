package Assignment2;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book>{
		public int compare(Book x, Book y) {
			String publisher1=x.getPublisher();
			String publisher2=y.getPublisher();
			int r = publisher1.compareTo(publisher2);
			return r;
		}

	}

