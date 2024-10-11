import java.lang.*;
import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int m=n;
		int sum=0;
		int r;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
		}
		if(sum==m)
			System.out.println("It's a Armstrong Number");
		else
			System.out.println("It's not a Armstrong Number");
	}
}