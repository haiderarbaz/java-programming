import java.lang.*;
import java.util.Scanner;

public class DisplayDay
{
	public static void main(String[] args)
	{
		int day;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Day Number");
		day = scn.nextInt();
		
		if(day==1)
		{
			System.out.println("Day is Monday");
		}
		
		else if(day==2)
		{
			System.out.println("Day is Tuesday");
		}
		
		else if(day==3)
		{
			System.out.println("Day is Wednesday");
		}
		
		else if(day==4)
		{
			System.out.println("Day is Thursday");
		}
		
		else if(day==5)
		{
			System.out.println("Day is Friday");
		}
		
		else if(day==6)
		{
			System.out.println("Day is Saturday");
		}
		
		else if(day==7)
		{
			System.out.println("Day is Sunday");
		}
		
		else
		{
			System.out.println("Invalid Day Number");
		}
	}
}