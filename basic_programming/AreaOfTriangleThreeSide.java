import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangleThreeSide
	{
		public static void main(String[] args)
		{
			int a,b,c;
			double s,area;
			
			Scanner scn = new Scanner (System.in);
			
			System.out.println("Enter the Side a");
			a = scn.nextInt();
			System.out.println("Enter the Side b");
			b = scn.nextInt();
			System.out.println("Enter the Side c");
			c = scn.nextInt();
			
			s = (a+b+c)/2;
			System.out.println("The sum of all three sides is " + s);
			
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of Triangle is " + area);
		}
	}