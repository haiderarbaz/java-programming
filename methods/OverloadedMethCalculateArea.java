import java.lang.*;
import java.util.*;

public class OverloadedMethCalculateArea
{	
	// Method to calculate area of rectangle
	static double area(double length, double breadth)
	{
			return length*breadth;
	}
	
	//Method to calculate area of circle
	static double area(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args)
	{	
		//Create a Scanner object for input
		Scanner scn = new Scanner(System.in);
		
		//Reading input for the rectangle
		System.out.println("Enter length of the rectangle:");
		double length=scn.nextDouble();
		System.out.println("Enter breadth of the rectangle:");
		double breadth=scn.nextDouble();
		
		//Calculating and displaying the area of the rectangle
		double rectArea=area(length,breadth);
		System.out.println("Area of the rectangle: "+rectArea);
		
		//Reading input for the circle
		System.out.println("Enter radius of the circle:");
		double radius=scn.nextDouble();
		
		//Calculating and displaying the area of the circle
		double rectCircle=area(radius);
		System.out.println("Area of the Circle: "+rectCircle);
		
	}

}