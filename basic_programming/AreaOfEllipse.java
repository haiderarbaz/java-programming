import java.lang.*;
import java.util.Scanner;

public class AreaOfEllipse
	{
		public static void main(String[] args)
		{
			int a,b;
			double pi=3.14;
			double area;
			
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter half of minor axis");
			a = scn.nextInt();
			
			System.out.print("Enter half of major axis");
			b = scn.nextInt();
			
			area = pi*a*b;
			System.out.print("Area of Ellipse " + area);
		}
	}