import java.lang.*;
import java.util.*;

public class NumberIsPrimeOrNot
{	
	static boolean isPrime(int n)
	{
		for(int i=2; i<n/2; i++)
		{
			if (n%i==0)
				return false; //n is divisible by i, so it's not prime
		}
		return true; //n is prime
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scn.nextInt();
		
		if(isPrime(a))
			System.out.println(a+" is Prime number");
		else 
			System.out.println(a+" not a Prime number");
	}
}