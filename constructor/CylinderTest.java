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
	private double radius;
	private double height;
	
	public Cylinder()
	{
		radius=1;
		height=1;
	}
	public Cylinder(int r)
	{
		height=1;
	}
	public Cylinder(int r, int h)
	{
		setRadius(r);
		setHeight(h);
		setDimensions(r,h);
	}
		
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
	
	public void setRadius(int r)
	{
		if (r>=0)
			radius=r;
		else
			radius=0;
	}
	public void setHeight(int h)
	{	
		if(h>=0)
			height=h;
		else
			height=0;
	}
	public void setDimensions(int r, int h)
	{	
		height=h;
		radius=r;
	}
	
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
public class CylinderTest
{
	public static void main(String[] args)
	{
		//Cylinder c = new Cylinder();
		
		Cylinder c = new Cylinder(12,14);
		c.setDimensions(12,14);
		
		System.out.println("LidArea: "+c.lidArea());
		System.out.println("circumference: "+c.circumference());
		System.out.println("totalSurfaceArea: "+c.totalSurfaceArea());
		System.out.println("voulume: "+c.volume());
		
		System.out.println("Height: "+c.getHeight());
		System.out.println("Radius: "+c.getRadius());
	}
}