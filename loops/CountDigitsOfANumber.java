import java.lang.*;
import java.util.Scanner;

public class CountDigitsOfANumber
{
	public static void main(String[] args)
	{
		int n;
		int count = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = scn.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}