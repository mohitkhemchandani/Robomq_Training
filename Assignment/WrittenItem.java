package Assignment;



public abstract class WrittenItem extends Item{
	private String author;
	
	public WrittenItem(int id_num, String title, int numOfCopies) {
		super(id_num, title, numOfCopies);
	}
	
	public String setAuthor(String author) {
		this.author=author;
		return this.author;
	}
	public String getAuthor() {
		return this.author;		
	}
	
}

class books extends WrittenItem{

	public books(int id_num, String title, int numOfCopies) {
		super(id_num, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return super.getAuthor();		
	}
	
}
class journal extends WrittenItem{

	public journal(int id_num, String title, int numOfCopies) {
		super(id_num, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
}