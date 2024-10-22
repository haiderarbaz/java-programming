import java.lang.*;
import java.util.*;

//class Cylinder

//Properties:
//radius
//height

//Methods:
//lidarea()
//totalSurfaceArea()
//volume()

class Cylinder
{
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+circumference()*height;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidArea()*height;
	}
}

public class Cylinderr
{
	public static void main(String[] args)
	{
	 Cylinder c1 = new Cylinder();
	 Cylinder c2 = new Cylinder();
	 
	 c1.radius=7;
	 c1.height=10;
	 
	 c2.radius=7;
	 c2.height=21;
	 
	 System.out.println("LidArea: "+c1.lidArea());
	 System.out.println("circumference: "+c1.circumference());
	 System.out.println("totalSurfaceArea: "+c1.totalSurfaceArea());
	 System.out.println("voulume: "+c1.volume());
	}
}
