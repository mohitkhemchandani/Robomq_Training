package Assignment3;

import java.util.HashSet;

public class ProductHashSet {

	public static void main(String[] args) {
		//8 WRAPPER sTRING MUST OVERRIDE HASHCODE AND EQUALS 
		HashSet<Product> products=new HashSet<Product>();
		
		products.add(new Product(1,"HP Pavilion",58000.450));
		products.add(new Product(2,"Lenovo",48000.450));
		products.add(new Product(3,"Acer",38000.450));
		products.add(new Product(4,"Dell",78000.450));
		products.add(new Product(5,"Mac Book",158000.450));
		products.add(new Product(2,"Lenovo",48000.450));
		
		System.out.println(products);

	}

}
