import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle
{
	public static void main(String[] args)
	{	
		Scanner scn = new Scanner (System.in);
		double b;
		double h;
		double area;
		System.out.println("Enter the base");
		b = scn.nextDouble();
		System.out.println("Enter the height");
		h = scn.nextDouble();
		
		area = b*h/2;
		System.out.println("Area of the Triangle is " + area);
	}
}
		