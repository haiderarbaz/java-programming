import java.lang.*;
import java.util.*;

//class Rectangle

//Properties:
//length
//breadth

//Methods:
//area()
//perimeter()
//isSquare()

class Rectangle
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare()
	{	
		if(length==breadth)
			return true;
		else 
			return false;
	}
}

public class Rectanglee
{
	public static void main(String[] args)
	{
	 Rectangle r1 = new Rectangle();
	 Rectangle r2 = new Rectangle();
	 
	 r1.length=7;
	 r1.breadth=21;
	 
	 r2.length=10.5;
	 r2.breadth=10.5;
	 
	 System.out.println("Area: "+r1.area());
	 System.out.println("Perimeter: "+r1.perimeter());
	 System.out.println("isSquare: "+r1.isSquare());
	 
	 System.out.println("Area2: "+r2.area());
	 System.out.println("Perimeter2: "+r2.perimeter());
	 System.out.println("isSquare: "+r2.isSquare());
	}
}
