import java.lang.*;
import java.util.*;

class TriangleArea
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int base,height;
		double area;
		System.out.println("Enter base and height");
		
		
		base=s.nextInt();
		height=s.nextInt();
		
		area=base*height*0.5;
		System.out.println("Area of Triangle is " +area);
	}
	
}