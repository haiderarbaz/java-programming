import java.lang.*;
import java.util.Scanner;

class AreaOfTriangleThreeSides
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double s;
		double area;
		System.out.println("Enter a, b and c");
		
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		s=(a+b+c)*0.5;
		System.out.println("Sum of all the side is " +s);
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is " +area);
	}
	
}