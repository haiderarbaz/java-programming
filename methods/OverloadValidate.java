import java.lang.*;
import java.util.*;

public class OverloadValidate
{	
	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	 
	static boolean validate(int age)
	{
		return age>=3 && age<=15;
	}
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);

		// Input for name validation
		System.out.println("Enter your name:");
		String name = scn.nextLine();
		if (validate(name)) 
		{
			System.out.println("Valid Name");
		} 
		else 
		{
			System.out.println("Invalid Name");
		}

		// Input for age validation
		System.out.println("Enter your age:");
		int age = scn.nextInt();
		if (validate(age)) 
		{
			System.out.println("Valid Age");
		} 
		else 
		{
			System.out.println("Invalid Age");
		}
	}
}