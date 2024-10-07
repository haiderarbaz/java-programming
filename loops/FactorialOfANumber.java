import java.lang.*;
import java.util.*;

public class FactorialOfANumber
{
	public static void main(String[] args)
	{
		int i,n;
		long fact=1;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		n = scn.nextInt();
		
		for(i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
}