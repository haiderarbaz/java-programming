import java.lang.*;
import java.util.Scanner;

public class NestedForLoop
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("("+i+","+j+") ");
				//it will print the output in table 2D form
			}
			System.out.println("");
			//it will print a new line
		}
	}
}