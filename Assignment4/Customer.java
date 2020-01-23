
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Customer{
			
		Connection con;
		PreparedStatement pre;
		Statement stat;
		ResultSet res;
		int customerid;
		String fname;
		String lname;
		String address;
		String email;
		Scanner sc=new Scanner(System.in);
		
		public Customer() 
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/customer","mohit","Mohit@123"); 
				System.out.println("Database Connected....");
				//CallableStatement stat=connection.prepareCall("create table customers (customerid int, " 
				//		+ "fname varchar(20),lname varchar(25), address varchar(100),email varchar(20))");
				//boolean result = stat.execute();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void insert() {

			try
			{
				System.out.println("Enter Customer Id:");
				customerid = sc.nextInt();
				System.out.println("Enter Customer First Name: ");
				fname=sc.next();
				System.out.println("Enter Customer Last Name: ");
				lname=sc.next();
				System.out.println("Enter Customer Email: ");
				email=sc.next();
				System.out.println("Enter Customer Address: ");
				address=sc.next();
				
				pre=con.prepareStatement("insert into customers values(?,?,?,?,?)");
				pre.setInt(1, customerid);
				pre.setString(2,fname);
				pre.setString(3,lname);
				pre.setString(4,email);
				pre.setString(5,address);
				
				int ra=pre.executeUpdate();
				if(ra>0)
					System.out.println("Customer details are successfully entered..");
				else
					System.out.println("Customer details are not entered");
				pre.close();
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void printCustomerDetails() {
			try {
				stat = con.createStatement();
				res = stat.executeQuery("select * from customers");
				while (res.next()) {
					System.out.println("Customer Id : " + res.getInt("customerid"));
					System.out.println("First Name : " + res.getString("fname"));
					System.out.println("Last Name : " + res.getString("lname"));
					System.out.println("Address : " + res.getString("address"));
					System.out.println("Email : " + res.getString("email"));

					System.out.println("");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void updateCustomerDetails() {
			try {
				
				System.out.println("Enter Customer Id:");
				customerid = sc.nextInt();
				System.out.println("Enter First Name:");
				fname = sc.next();
				System.out.println("Enter Last Name:");
				lname = sc.next();
				System.out.println("Enter Email:");
				email = sc.next();
				System.out.println("Enter Address:");
				address = sc.next();
				pre = con.prepareStatement("Update customers set fname=?,lname=?,email=?,address=?  where customerid=?");
				
				pre.setString(1, fname); 
				pre.setString(2, lname);
				pre.setString(3, email); 
				pre.setString(4, address); 
				pre.setInt(5, customerid);
				int ra = pre.executeUpdate();
				if (ra > 0)
					System.out.println("Name updated");
				else
					System.out.println("Name is not updated..");
				pre.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void deleteCustomerDetails() {
			try {

				System.out.println("Enter Customer Id to delete:");
				customerid = sc.nextInt();
				pre = con.prepareStatement("delete from customers where customerid=?");
				pre.setInt(1, customerid);
				int ra = pre.executeUpdate();
				if (ra > 0)
					System.out.println("Record Deleted...");
				else
					System.out.println("Record has not Deleted...");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		public static void main(String[] args) {

			int choice;
			Scanner sc = new Scanner(System.in);
			Customer customers = new Customer();

			while (true) {
				System.out.println(
						"Enter your choice(1-5):\n1.Insert Cutomer\n2.Update Customer\n3.Delete Customer\n4.Print Customer\n5.Exit Application");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					customers.insert();
					break;
				case 2:
					customers.updateCustomerDetails();
					break;
				case 3:
					customers.deleteCustomerDetails();
					break;
				case 4:
					customers.printCustomerDetails();
					break;
				case 5:
					System.out.println("Thanks For Using.....!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice....!");

				}
			}

		}
}
		