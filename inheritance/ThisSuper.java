import java.lang.*;
import java.util.*;

class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int area()
	{
		return length*breadth;
	}
	void display()
	{
		System.out.println("Length: "+this.length);
		System.out.println("breadth: "+this.breadth);
	}
}
public class ThisSuper
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(30,24);
		r.display();
		System.out.println("Area is: "+r.area());
	}
}