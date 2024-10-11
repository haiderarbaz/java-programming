import java.lang.*;
import java.util.Scanner;

public class Patterns3
{
	public static void main(String[] args)
	{	
		int count=0;
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{	
				++count;
				System.out.format("%02d ",count);
				//instead of print we can call format method and print with %02d (blank space will be filled with zero)(d is decimal type) with 2 spaces after spaces we can print count
				
				//System.out.print(count+" ");
				//this will print in normal way
			}
			System.out.println("");
		}
	}
}