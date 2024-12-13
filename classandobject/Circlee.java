import java.lang.*;
import java.util.*;

//class Circle

//Properties:
//radius

//Methods:
//area()
//perimeter()
//circumferenece()

class Circle
{
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}
}

public class Circlee
{
	public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);

	Circle c1 = new Circle();
	Circle c2 = new Circle();

	System.out.println("Enter the radius of the first circle: ");
	c1.radius=scn.nextDouble();

	System.out.println("Area: "+c1.area());
	System.out.println("Perimeter: "+c1.perimeter());
	System.out.println("Circumference: "+c1.circumference());

	System.out.println("Enter the radius of the second circle: ");
	c2.radius=scn.nextDouble();
	 
	System.out.println("Area2: "+c2.area());
	System.out.println("Perimeter2: "+c2.perimeter());
	System.out.println("Circumference2: "+c2.circumference());

	 scn.close();
	}
}
