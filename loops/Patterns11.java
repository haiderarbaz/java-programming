import java.lang.*;
import java.util.Scanner;

public class Patterns11
{	
	public static void main(String[] args)
	{	
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if(j>=i)
				System.out.print("* ");
				else
				System.out.print("_ ");
			}
			System.out.println("");
		}
	}
}