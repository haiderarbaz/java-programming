import java.lang.*;
import java.util.*;

class CuboidArea
{
	public static void main(String[] args)
	{
		int l,b,h; //l=length, b=breadth, h=height and breadth and width are same
		int totalSurfaceArea, volume, perimeter;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of l,b, & h");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		
		totalSurfaceArea=2*(l*h+l*b+h*b);
		System.out.println("Total Surface Area of the cuboid is " +totalSurfaceArea);
		
		volume=l*b*h;
		System.out.println("Volume of the cuboid is " +volume);
		
		perimeter=4*(l+b+h);
		System.out.println("Perimeter of the cuboid is " +perimeter);
	}
}