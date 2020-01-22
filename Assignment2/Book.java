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
		
		
		public String getMemName() {
			return memName;
		}


		public void setMemName(String memName) {
			this.memName = memName;
		}


		public int getMemId() {
			return memId;
		}


		public void setMemId(int memId) {
			this.memId = memId;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getPublisher() {
			return publisher;
		}


		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		@Override
		public String toString() {
			return "Book [memName=" + memName + ", memId=" + memId + ", author=" + author + ", publisher=" + publisher
					+ ", quantity=" + quantity + "\n]";
		}
		
		
}
