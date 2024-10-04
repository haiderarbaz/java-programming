import java.lang.*;
import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args)
	{
		int r;
		double pi=3.14;
		double area;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		r = scn.nextInt();
		
		area = pi*r*r;
		System.out.println("Area of circle " + area);
	}
}