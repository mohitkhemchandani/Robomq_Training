package Assignment2;
import java.util.Comparator;

public class SortByNam implements Comparator<Book>{
		public int compare(Book b1, Book b2) {
			String name1=b1.getMemName();
			String name2=b2.getMemName();
			int r = name1.compareTo(name2);
			return r;
		}	
}
