import java.lang.*;
import java.util.Scanner;

public class DisplayDigitsOfNumbers

{
	public static void main(String[] args)
	{
		int n, r;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		n = scn.nextInt();
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			
			System.out.println(r);
		}
	}
}