import java.lang.*;
import java.util.*;

class Product
{
	private String itemno;
	private String name;
	private double price;
	private short quantity;
	
	public Product(String i)
	{
		itemno=i;
	}
	public Product(String i, String n)
	{
		itemno=i;
		name=n;
	}
	public Product(String i, String n, double p, short q)
	{
		itemno=i;
		name=n;
		price=p;
		quantity=q;
	}
	public String getItemNo()
	{
		return itemno;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public short getQuantity()
	{
		return quantity;
	}
	
	public void setPrice(double p)
	{
		price=p;
	}
	public void setQuantity(short q)
	{
		quantity=q;
	}
	
	public String toString()
	{
		return "Item No:"+itemno+"\n"+"Name:"+name+"\n"+"Price:"+price+"\n"+"Quantity:"+quantity+"\n";
	}
}

class Customer
{
	private String customerId;
	private String name;
	private String address;
	private String phoneNo;
	
	public Customer(String custId, String n)
	{
		customerId=custId;
		name=n;
	}
	public Customer(String custId, String n, String addre, String phoNo)
	{
		customerId=custId;
		name=n;
		address=addre;
		phoneNo=phoNo;
	}
	
	public String getCustomerId()
	{
		return customerId;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	
	public void setAddress(String addre)
	{
		address=addre;
	}
	public void setPhoneNo(String phoNo)
	{
		phoneNo=phoNo;
	}
	
	public String toString()
	{
		return "Customer Id:"+customerId+"\n"+"Name:"+name+"\n"+"Address:"+address+"\n"+"Phone No:"+phoneNo+"\n";
	}
}
public class ProductTest
{
	public static void main(String[] args)
	{
		Product pro = new Product("12FG4","Carpet",1000.0, (short)500);
		
		System.out.println("ItemNo: " + pro.getItemNo());
        System.out.println("Name: " + pro.getName());
        System.out.println("Price: " + pro.getPrice());
        System.out.println("Quantity: " + pro.getQuantity());
		
		System.out.println("Product Details:\n "+ pro );
		
		Customer cust = new Customer("18ARB2024", "Arbaz", "Bengaluru, KA", "+91 9738736201");
		
		System.out.println("Customer Id: " + cust.getCustomerId());
        System.out.println("Name: " + cust.getName());
        System.out.println("Adddress: " + cust.getAddress());
        System.out.println("Phone No: " + cust.getPhoneNo());
		
		System.out.println("Customer Details:\n "+ cust );
	}
}
