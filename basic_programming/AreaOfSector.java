import java.lang.*;
import java.util.Scanner;

public class AreaOfSector
	{
		public static void main(String[] args)
		{
			double r,angle,area;
			double pi;
			
			Scanner scn = new Scanner (System.in);
			
			System.out.print("Enter pi value");
			pi = scn.nextDouble();
			
			System.out.print("Enter radius of the sector");
			r = scn.nextDouble();
			
			System.out.print("Enter angle of the sector");
			angle = scn.nextDouble();
			
			area = ((pi*r*r)*(angle/360))/2;
			System.out.print("Area is " + area);
		}
	}