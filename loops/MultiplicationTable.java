import java.lang.*;
import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int n,i;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		n = scn.nextInt();
		
		for (i=1; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}