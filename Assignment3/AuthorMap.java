package Assignment3;

import java.util.TreeMap;
import java.util.Set;

public class AuthorMap {
		public static void main(String[] args)
		{
			TreeMap<String,Author>authors = new TreeMap<String,Author>();
			authors.put("Book1",new Author(1, "Author1","Address1"));
			authors.put("Book2",new Author(2, "Author2","Address2"));
			authors.put("Book3",new Author(3, "Author3","Address3"));
			authors.put("Book4", new Author(4, "Author1", "Address4"));
			
			Set<String>keys=authors.keySet();
			for(String i:keys)
			{
				Author a=authors.get(i);
				System.out.println(i +" witten by " + a.getAuthName() + " residing at " + a.getAuthaddress());
			}
		}
}

