import java.lang.*;
import java.util.Scanner;

public class AreaOfSquare
	{
		public static void main(String[] args)
		{
			int a;
			double area;
			
			Scanner scn = new Scanner (System.in);
			
			System.out.println("Enter sides of square");
			a = scn.nextInt();
			
			area = a*a;
			System.out.println("Area of Square " + area);
		}
	}