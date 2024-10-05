import java.lang.*;
import java.util.Scanner;

public class Grades

{
	public static void main(String[] args)
	{
		int m1,m2,m3;
		int total;
		double avg;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter marks of 3 subjects");
		m1 = scn.nextInt();
		m2 = scn.nextInt();
		m3 = scn.nextInt();
		
		total = m1+m2+m3;
		System.out.println("Total marks is " + total);
		
		avg = (m1+m2+m3)/3;
		System.out.println("Avg marks is " + avg);
		
		if (avg>=70)
		{
			System.out.println("Grade A");
		}	
		
		else if (avg>=60 && avg<70)
		{
			System.out.println("Grade B");
		}
		
		else if (avg>=50 && avg<60)
		{
			System.out.println("Grade C");
		}
		
		else if (avg>=40 && avg<50)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
}