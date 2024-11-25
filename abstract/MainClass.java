import java.lang.*;
import java.util.*;

abstract class Shape
{
	abstract public double perimeter();
	abstract public double area();
}
class Circle extends Shape
{
	double radius;
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape
{
	double length;
	double breadth;
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public double area()
	{
		return length*breadth;
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Rectangle r= new Rectangle();
		r.length=10;
		r.breadth=30;
		Circle c=new Circle();
		c.radius=32;
		
		Shape s=r;
		Shape e=c;
		
		System.out.println("Rectangle Perimeter= "+r.perimeter());
		System.out.println("Rectangle area= "+r.area());
		System.out.println("Circle Perimeter= "+c.perimeter());
		System.out.println("Circle area= "+c.area());
	}
}