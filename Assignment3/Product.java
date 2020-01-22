package Assignment3;


//JavaBean Class ==> private data = getter/setter default constructor
//
public class Product {
	private int id;
	private String name;
	private double price;
	
	
	public Product(){}
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() //getter for private property
	{
		return id;
	}
	public void setId(int id)//setter for private property
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString()
	{
		return "\nProduct Id : "+id+" Product Name : "+name+" Product Price : "+price;
	}
	
	public int hashCode() {
		int code=0;
		code=id*20;
		code+= name.hashCode();
		System.out.println("In HashCode ....."+code);
		return name.hashCode();
	}
	public boolean equals(Object o) {
		System.out.println("In equals()...");
		boolean flag=false;
		if(o instanceof Product)
		{
			Product p=(Product)o;
			if(p.id == this.id)
				flag=true;
		}
		return flag;
	}
}
 
