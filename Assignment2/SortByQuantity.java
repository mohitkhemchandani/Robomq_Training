package Assignment2;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{
	@Override
	public int compare(Book id1, Book id2) {
		int a = (int) ((int) id1.getQuantity() - id2.getQuantity());
		return a;
	}
}
