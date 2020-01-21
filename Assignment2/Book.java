package Assignment2;

public class Book {
		private String memName;
		private int memId;
		private String author;
		private String publisher;
		private int quantity;
		
		public Book(String memName, int memId, String author, String publisher, int quantity) {
			super();
			this.memName = memName;
			this.memId = memId;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
		
		@Override
		public String toString() {
			return "Book [memName=" + memName + ", memId=" + memId + ", author=" + author + ", publisher=" + publisher
					+ ", quantity=" + quantity + "]";
		}
		
		
}
