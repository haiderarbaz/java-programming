import java.lang.*;
import java.util.Scanner;

public class AreaOfTrapezoid
{
	public static void main(String[] args)
	{
		int a,b,h;
		double area;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter side a");
		a = scn.nextInt();
		
		System.out.println("Enter side b");
		b = scn.nextInt();
		
		System.out.println("Enter vertical height h");
		h = scn.nextInt();
		
		area = ((a+b)*h)/2;
		System.out.println("Area of Trapezoid " + area);
	}
}
		