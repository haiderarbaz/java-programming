import java.lang.*;
import java.util.Scanner;

public class Patterns6
{
	public static void main(String[] args)
	{	
		System.out.println("Printing Stars");
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{	
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}