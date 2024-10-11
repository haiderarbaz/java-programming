import java.lang.*;
import java.util.Scanner;

public class Patterns7
{
	public static void main(String[] args)
	{	
		System.out.println("Printing Stars");
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5-i+1; j++)
			{	
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}