import java.lang.*;
import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int m=n, rev=0, r;
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		//System.out.println(rev);
		
		if(rev==m)
			{
				System.out.println("Number is Palindrome");
			}
		else
			{
				System.out.println("Number is Not-Palindrome");
			}
	}
}