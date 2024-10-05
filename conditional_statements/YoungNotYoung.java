import java.lang.*;
import java.util.Scanner;

public class YoungNotYoung
{
	public static void main(String args[])
	{
		int age;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Age of person");
		age = scn.nextInt();
		
		if (age>=14 && age<=55)
		{
			System.out.println("Person is Young");
		}
		else
		{
			System.out.println("Person is NotYoung");
		}
	}
}