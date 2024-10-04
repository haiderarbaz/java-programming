import java.lang.*;
import java.util.Scanner;

public class AreaOfRectangle
	{
		public static void main(String[] args)
		{
			int w,h;
			double area;
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter width of the Rectangle");
			w = scn.nextInt();
			System.out.println("Enter height of the Rectangle");
			h = scn.nextInt();
			
			area = w*h;
			System.out.println("Area of the Rectangle " + area);
		}
	}