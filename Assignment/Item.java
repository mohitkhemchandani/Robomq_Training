package Assignment;

public abstract class Item {
	private int id_num=0;
	private String title="";
	private int numOfCopies=0;
	
	public Item(int id_num, String title, int numOfCopies) {
		this.id_num = id_num;
		this.title = title;
		this.numOfCopies = numOfCopies;
	}
	public void setId(int id){
		id_num = id;
	}
	public int getId(){
		return id_num;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setCopy(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	
	public int getCopy(){
		return numOfCopies;
	}
	
	public void equals()
	{
		System.out.println("Equals....");
	}
	
	public void checkIn() {
		System.out.println("Checkin....");
	}
	
	public void checkOut(){
		System.out.println("Checkout....");
	}
	
	public void intoString() {
		System.out.println("toString...");
	}
	
	
	public void printInfo()
	{
		System.out.println("Id: "+id_num);
		System.out.println("Title: "+ title);
		System.out.println("Number of Copies: "+numOfCopies);
		
	}
}
