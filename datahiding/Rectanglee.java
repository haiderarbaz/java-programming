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
	private double length;
	private double breadth;
	
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	
	public void setLength(double l)
	{	
		if(l>0)
			length=l;
		else 
			length=0;
	}
	public void setBreadth(double b)
	{	
		if(b>0)
			breadth=b;
		else 
			breadth=0;
	}
	
	public double area()
	{
		return length*breadth;
		//return getLength()*getBreadth; //you can call methods also
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
	 Rectangle r3 = new Rectangle();
	 
	 //these methods are for writing or changing the value length & breadth
	 r1.setLength(10.5);
	 r1.setBreadth(21.5);
	 
	 r2.setLength(10.5);
	 r2.setBreadth(5.5);
	 
	 r3.setLength(-10.5);
	 r3.setBreadth(5.5);
	 
	 System.out.println("Area: "+r1.area());
	 System.out.println("Perimeter: "+r1.perimeter());
	 System.out.println("isSquare1: "+r1.isSquare());
	 
	 System.out.println("Area2: "+r2.area());
	 System.out.println("Perimeter2: "+r2.perimeter());
	 System.out.println("isSquare2: "+r2.isSquare());
	 
	 System.out.println("Area3: "+r3.area());
	 System.out.println("Perimeter3: "+r3.perimeter());
	 System.out.println("isSquare3: "+r3.isSquare());
	 
	 //these method are for reading
	 System.out.println("Length "+r2.getLength());
	 System.out.println("Breadth "+r2.getBreadth());
	 
	 System.out.println("Length "+r3.getLength());
	 System.out.println("Breadth "+r3.getBreadth());
	}
}
