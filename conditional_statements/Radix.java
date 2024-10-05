import java.lang.*;
import java.util.Scanner;

public class Radix
{
	public static void main(String[] args)
	{
		String str;
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter a String");
		str =scn.nextLine();
		
		if(str.matches("[01]+"))
		{ 
			System.out.println("String is Binary and Radix is 2");
		}
		
		else if(str.matches("[0-7]+"))
		{
			System.out.println("String is Octal and Radix is 8");
		}
		
		else if(str.matches("[0-9]+"))
		{
		System.out.println("String is Decimal and Radix is 10");
		}
		
		else if(str.matches("[0-9,A-F]+"))
		{
		System.out.println("String is Hexadecimal and Radix is 16");
		}
		
		else
		{
			System.out.println("String is invalid");
		}
	}
}