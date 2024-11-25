import java.lang.*;
import java.util.*;

class Rectangle
{
	int length;
	int breadth;
	int x=10;
	
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}

class Cuboid extends Rectangle
{
	int height;
	int x=20;
	
	Cuboid(int l, int b, int h)
	{
		super(l,b);
		height=h;
	}
	void display()
	{
		System.out.println(super.x);
		System.out.println(x);
	}
	int area()
	{
		return length*breadth*height;
	}
}

public class ThisSuper0
{
	public static void main(String[] args)
	{
		Cuboid c=new Cuboid(10,5,15);
		c.display();
		System.out.println("Area is: "+c.area());
	}
}