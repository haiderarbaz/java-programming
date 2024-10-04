import java.lang.*;
import java.util.Scanner;

public class AreaOfSectors
	{
		public static void main(String[] args)
		{
			double r,angle,area;
			double pi;
			
			Scanner scn = new Scanner (System.in);
			
			System.out.print("Enter radius of the sector");
			r = scn.nextDouble();
			
			System.out.print("Enter angle of the sector");
			angle = scn.nextDouble();
			
			area = ((r*r)*angle)/2;
			System.out.print("Area is " + area);
		}
	}