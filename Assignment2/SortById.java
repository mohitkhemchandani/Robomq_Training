package Assignment2;

import java.util.Comparator;

	public class SortById implements Comparator<Book>{

		@Override
		public int compare(Book id1, Book id2) {
			int a = (int) ((int) id1.getMemId() - id2.getMemId());
			return a;
		}
	}

