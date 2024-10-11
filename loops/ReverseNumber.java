import java.lang.*;
import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		
		int r, rev=0;
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println("Reverse of a Number " + rev);
		//System.out.println(n);
		//This will print n(0);
	}
}