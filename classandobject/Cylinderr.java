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
		Scanner scn=new Scanner(System.in);

		Cylinder c1 = new Cylinder();
	 	Cylinder c2 = new Cylinder();

		System.out.println("Enter the radius of the first Cylinder: ");
		c1.radius=scn.nextDouble();
		System.out.println("Enter the height of the first Cylinder: ");
		c1.height=scn.nextDouble();

		System.out.println("LidArea: "+c1.lidArea());
		System.out.println("circumference: "+c1.circumference());
		System.out.println("totalSurfaceArea: "+c1.totalSurfaceArea());
		System.out.println("voulume: "+c1.volume());

		System.out.println("Enter the radius of the second Cylinder: ");
		c2.radius=scn.nextDouble();
		System.out.println("Enter the height of the second Cylinder: ");
		c2.height=scn.nextDouble();

		System.out.println("LidArea: "+c2.lidArea());
		System.out.println("circumference: "+c2.circumference());
		System.out.println("totalSurfaceArea: "+c2.totalSurfaceArea());
		System.out.println("voulume: "+c2.volume());

		scn.close();
	}
}
