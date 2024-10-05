import java.lang.*;
import java.util.*;

public class LeapYear
{
	public static void main(String[] args)
	{
		int year;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the year");
		year = scn.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if (year%400==0)
				{
					System.out.println("It's a LeapYear");
				}
				else
				{
					System.out.println("Not a LeapYear");
				}
			}
			else
			{
				System.out.println("It's a LeapYear");
			}
			
		}
		else
		{
			System.out.println("Not a LeapYear");
		}
	}
}